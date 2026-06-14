import java.util.*;

// This program generates the Fibonacci series up to a specified number of terms input by the user using a recursive approach.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n > 0) {
                System.out.println("Recursive Fibonacci series:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("Invalid input: number of terms must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }

    private static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
