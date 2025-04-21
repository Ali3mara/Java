import java.util.Scanner;
public class SimpleProjects {
    static Scanner scanner = new Scanner(System.in); //NEED UNDERSTANDING
    static String answer = "yes";
    public static void main(String[] args) {
        //Calculator app
        while(answer.equalsIgnoreCase("yes")) {
            ASK();
            System.out.println("Would you like to make another calculation? (yes/no)");
            answer = scanner.next();
        }
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }

    public static void ASK() {
        System.out.println("Enter first number: ");
        double x = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double y = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /): ");
        String operator = scanner.next();
        System.out.println("Result: " + OP(x, y, operator));
    }
    
    public static double OP(double x, double y, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y != 0) {
                    result = x / y;
                } else {
                System.out.println("Error: Division by zero is not allowed.");
                return 0; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return 0; // Exit the program
            }
            return result;
        }
    }