import java.util.Scanner;

// This program generates the Fibonacci series up to a specified number of terms, ensuring that the input is a valid positive integer.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        if (scanner.hasNextInt()) {
            int terms = scanner.nextInt();

            if (terms > 0) {
                System.out.println("Fibonacci series:");
                for (int i = 0; i < terms; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("Please enter a positive number of terms.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }

    private static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long first = 0;
        long second = 1;
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }
}
