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
        // Display calculator instructions
        System.out.println("\n=== Basic Calculator ===");
        System.out.println("You can perform basic operations: +, -, *, /");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform calculation based on the operator
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                break;
        }

        // Waiting some times for the user to see the result
        System.out.println("Waiting for 5 seconds to see the result...");
        try {
            Thread.sleep(5000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Ask user if they want to continue or exit
        System.out.println("Choose the following: \n 1. Continue \n 2. Exit");
        System.out.print("Enter your chooice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            basicCalculator(scanner); // Call the method again for another calculation
        } else {
            System.out.println("Exiting the calculator. Goodbye!");
        }
    }

    // Feature 2: Number Guessing Game
    public static void numberGuessingGame(Scanner scanner) {
        // Display game instructions
        System.out.println("\n=== Number Guessing Game ===");
        int randomNumber = (int) (Math.random() * 100) + 1; //NEW FOR ME
        int user = 0;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100: ");

        // Loop until the user guesses the correct number
        while (user != randomNumber){
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 100:");
                scanner.next();
            }
            user = scanner.nextInt();
            attempts++;
            if(user < 1 || user > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (user > randomNumber) {
                System.out.println("Lower!!! ");
            } else if (user < randomNumber) {
                System.out.println("Higher!!! ");
            } else{
                System.out.println("You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }

        // Waiting some times for the user to see the result
        System.out.println("Waiting for 5 seconds to see the result...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Ask user if they want to continue or exit
        System.out.println("Choose the following: \n 1. Continue \n 2. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            numberGuessingGame(scanner); // Call the method again for another game
        } else {
            System.out.println("Exiting the game. Goodbye!");
        }
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
