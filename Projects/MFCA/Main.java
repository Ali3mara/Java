package Projects.MFCA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n=== Multi-Functional Console Application ===");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Number Guessing Game");
            System.out.println("3. Student Grades Manager");
            System.out.println("4. File Reader/Writer");
            System.out.println("5. Prime Number Checker");
            System.out.println("6. Palindrome Checker");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Get user input
            while (!scanner.hasNextInt()) { 
                System.out.println("Invalid input. Please enter a number between 0 and 6:");
                scanner.next(); // clear invalid input
            }
            choice = scanner.nextInt();

            // Handle user choice
            switch (choice) {
                case 1:
                    basicCalculator(scanner);
                    break;
                case 2:
                    numberGuessingGame(scanner);
                    break;
                case 3:
                    studentGradesManager(scanner);
                    break;
                case 4:
                    fileReaderWriter(scanner);
                    break;
                case 5:
                    primeNumberChecker(scanner);
                    break;
                case 6:
                    palindromeChecker(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Feature 1: Basic Calculator
    public static void basicCalculator(Scanner scanner) {
        System.out.println("[Basic Calculator feature here]");
    }

    // Feature 2: Number Guessing Game
    public static void numberGuessingGame(Scanner scanner) {
        System.out.println("[Number Guessing Game feature here]");
    }

    // Feature 3: Student Grades Manager
    public static void studentGradesManager(Scanner scanner) {
        System.out.println("[Student Grades Manager feature here]");
    }

    // Feature 4: File Reader/Writer
    public static void fileReaderWriter(Scanner scanner) {
        System.out.println("[File Reader/Writer feature here]");
    }

    // Feature 5: Prime Number Checker
    public static void primeNumberChecker(Scanner scanner) {
        System.out.println("[Prime Number Checker feature here]");
    }

    // Feature 6: Palindrome Checker
    public static void palindromeChecker(Scanner scanner) {
        System.out.println("[Palindrome Checker feature here]");
    }
}
