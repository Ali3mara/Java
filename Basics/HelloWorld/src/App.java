import java.util.Scanner;

public class App {

    // This is a single-line comment

    /*
      This is a multi-line comment
      Java Basics HelloWorld Project
     */
    public static void main(String[] args) {
        // Variables & Data Types
        int number = 10;
        double pi = 3.14;
        boolean isJavaFun = true;
        char grade = 'A';
        String message = "Hello, Java World!";

        // Print statement
        System.out.println(message);

        // Operators
        int sum = number + 5;
        System.out.println("Sum: " + sum);

        // Control Flow - if/else
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // Switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            default:
                System.out.println("Keep trying!");
        }

        // Loops
        System.out.println("For Loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("While Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("count = " + count);
            count++;
        }

        // Arrays
        int[] numbers = {1, 2, 3};
        for (int n : numbers) {
            System.out.println("Array value: " + n);
        }

        // Methods
        printSquare(4);

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Exception Handling
        try {
            int result = number / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This will always be pr");
        }
        ExceptionHandling;

        // Type Casting
        double d = 9.78;
        int casted = (int) d;
        System.out.println("Casted value: " + casted);

        scanner.close();
    }

    // A simple method
    public static void printSquare(int num) {
        System.out.println("Square: " + (num * num));
    }
}
