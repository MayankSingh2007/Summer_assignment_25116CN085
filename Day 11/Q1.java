import java.util.*;

// This program takes two integer inputs from the user and calculates their sum, ensuring that the inputs are valid integers.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        boolean isValidFirst = scanner.hasNextInt();

        if (isValidFirst) {
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            boolean isValidSecond = scanner.hasNextInt();

            if (isValidSecond) {
                int b = scanner.nextInt();
                int sum = addNumbers(a, b);
                System.out.println("Sum of the two numbers is: " + sum);
            } else {
                System.out.println("Invalid input: please enter an integer for the second number.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer for the first number.");
        }

        scanner.close();
    }

    private static int addNumbers(int a, int b) {
        return a + b;
    }
}
