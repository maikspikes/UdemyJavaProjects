import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
