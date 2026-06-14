import java.util.*;

// This program takes two integer inputs from the user and calculates their sum, ensuring that the inputs are valid integers.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n >= 0) {
                long factorial = findFactorial(n);
                System.out.println("Factorial of " + n + " is: " + factorial);
            } else {
                System.out.println("Invalid input: number must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }

    private static long findFactorial(int n) {
        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
