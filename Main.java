import java.util.*;

public class Main {
    static class Command {
        int existingCube;
        int newCube;
        String dir;

        Command(int existingCube, int newCube, String dir) {
            this.existingCube = existingCube;
            this.newCube = newCube;
            this.dir = dir.toLowerCase();
        }
    }

    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Position other = (Position) obj;
            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int totalCommands = sc.nextInt();

        List<Command> commandList = new ArrayList<>();

        for (int i = 0; i < totalCommands; i++) {
            int existingCube = sc.nextInt();
            int newCube = sc.nextInt();
            String dir = sc.next();
            commandList.add(new Command(existingCube, newCube, dir));
        }

        int targetCube = sc.nextInt();

        // Sort commands: existingCube ascending, then newCube ascending
        commandList.sort((c1, c2) -> {
            if (c1.existingCube != c2.existingCube) {
                return Integer.compare(c1.existingCube, c2.existingCube);
            }
            return Integer.compare(c1.newCube, c2.newCube);
        });

        Map<Integer, Position> cubeToPos = new HashMap<>();
        Map<Position, Integer> posToCube = new HashMap<>();

        // Place initial existing cube at origin (0, 0)
        int initialCube = commandList.get(0).existingCube;
        Position origin = new Position(0, 0);
        cubeToPos.put(initialCube, origin);
        posToCube.put(origin, initialCube);

        // Process placement commands
        for (Command cmd : commandList) {
            Position basePos = cubeToPos.get(cmd.existingCube);
            if (basePos == null) continue;

            int nextX = basePos.x;
            int nextY = basePos.y;

            if (cmd.dir.equals("top") || cmd.dir.equals("up")) {
                nextY += 1;
            } else if (cmd.dir.equals("bottom") || cmd.dir.equals("down")) {
                nextY -= 1;
            } else if (cmd.dir.equals("left")) {
                nextX -= 1;
            } else if (cmd.dir.equals("right")) {
                nextX += 1;
            }

            Position nextPos = new Position(nextX, nextY);

            // Clear old mapping at destination coordinate if replaced
            if (posToCube.containsKey(nextPos)) {
                int displacedCube = posToCube.get(nextPos);
                cubeToPos.remove(displacedCube);
            }

            // If newCube already existed elsewhere, remove its old location
            if (cubeToPos.containsKey(cmd.newCube)) {
                Position oldPos = cubeToPos.get(cmd.newCube);
                posToCube.remove(oldPos);
            }

            cubeToPos.put(cmd.newCube, nextPos);
            posToCube.put(nextPos, cmd.newCube);
        }

        if (!cubeToPos.containsKey(targetCube)) {
            System.out.println("-1 -1 -1 -1");
            return;
        }

        Position targetPos = cubeToPos.get(targetCube);

        Position upPos = new Position(targetPos.x, targetPos.y + 1);
        Position downPos = new Position(targetPos.x, targetPos.y - 1);
        Position leftPos = new Position(targetPos.x - 1, targetPos.y);
        Position rightPos = new Position(targetPos.x + 1, targetPos.y);

        int up = posToCube.getOrDefault(upPos, -1);
        int down = posToCube.getOrDefault(downPos, -1);
        int left = posToCube.getOrDefault(leftPos, -1);
        int right = posToCube.getOrDefault(rightPos, -1);

        String result = String.format("%d %d %d %d", up, down, left, right);
        System.out.println(result);
        
        sc.close();
    }
}