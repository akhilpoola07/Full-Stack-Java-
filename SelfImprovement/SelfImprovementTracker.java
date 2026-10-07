package SelfImprovement;
import java.util.ArrayList;
import java.util.Scanner;

public class SelfImprovementTracker {

    static ArrayList<Goal> goals = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int goalId = 1;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n🌱 SELF IMPROVEMENT TRACKER 🌱");
            System.out.println("1. Add Goal");
            System.out.println("2. View Goals");
            System.out.println("3. Mark Goal as Completed");
            System.out.println("4. View Progress");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addGoal();
                    break;
                case 2:
                    viewGoals();
                    break;
                case 3:
                    completeGoal();
                    break;
                case 4:
                    viewProgress();
                    break;
                case 5:
                    System.out.println("Keep improving, bro! 💪");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Add new goal
    static void addGoal() {
        System.out.print("Enter your self-improvement goal: ");
        String desc = sc.nextLine();

        goals.add(new Goal(goalId++, desc));
        System.out.println("Goal added successfully!");
    }

    // View all goals
    static void viewGoals() {
        if (goals.isEmpty()) {
            System.out.println("No goals added yet.");
            return;
        }

        for (Goal g : goals) {
            System.out.println(
                "ID: " + g.id +
                " | Goal: " + g.description +
                " | Status: " + (g.completed ? "Completed ✅" : "Pending ❌")
            );
        }
    }

    // Mark goal as completed
    static void completeGoal() {
        System.out.print("Enter Goal ID to mark completed: ");
        int id = sc.nextInt();

        for (Goal g : goals) {
            if (g.id == id) {
                g.completed = true;
                System.out.println("Goal marked as completed!");
                return;
            }
        }
        System.out.println("Goal not found!");
    }

    // View progress summary
    static void viewProgress() {
        int completed = 0;

        for (Goal g : goals) {
            if (g.completed) {
                completed++;
            }
        }

        System.out.println("Total Goals     : " + goals.size());
        System.out.println("Completed Goals : " + completed);
        System.out.println("Pending Goals   : " + (goals.size() - completed));
    }
}
