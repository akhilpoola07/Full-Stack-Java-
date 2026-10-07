package Day12;

public class Threads {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new Task1(), "Thread-1");
        Thread thread2 = new Thread(new Task2(), "Thread-2");
        
        // Start both threads
        thread1.start();
        thread2.start();
        
        // Main thread continues executing
        System.out.println("Main thread finished starting both threads");
    }
}

// First task - prints numbers 1 to 5
class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread-1: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread-1 completed!");
    }
}

// Second task - prints letters A to E
class Task2 implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Thread-2: " + c);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread-2 completed!");
    }
}
