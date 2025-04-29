package Basics.HelloWorld;

import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {

        System.out.println("=== Error Handling in Java ===");

        // 1. ArithmeticException (e.g., division by zero)
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("[ArithmeticException] Cannot divide by zero.");
        }

        // 2. InputMismatchException (invalid input from user)
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();  // throws InputMismatchException if input is not an integer
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("[InputMismatchException] Invalid input! Please enter a number.");
            scanner.nextLine(); // clear the invalid input
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[ArrayIndexOutOfBoundsException] Index is out of bounds.");
        }

        // 4. NullPointerException
        try {
            String text = null;
            System.out.println("Text length: " + text.length()); // null object call
        } catch (NullPointerException e) {
            System.out.println("[NullPointerException] You tried to use a null object.");
        }

        // 5. FileNotFoundException / IOException
        try {
            File file = new File("nonexistent.txt");
            Scanner fileScanner = new Scanner(file); // throws FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("[FileNotFoundException] File not found.");
        }

        // 6. Finally block demonstration
        try {
            System.out.println("Trying something risky...");
            int risky = 100 / 2;
            System.out.println("Success! Result: " + risky);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("[Finally] This always runs, no matter what.");
        }

        scanner.close();
    }
}
