import java.util.*;

// This program calculates the sum of the digits of a given integer input by the user using a recursive approach.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n >= 0) {
                long result = factorial(n);
                System.out.println("Factorial of " + n + " is: " + result);
            } else {
                System.out.println("Invalid input: number must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
