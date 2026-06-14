import java.util.*;

// This program calculates the sum of the digits of a given integer input by the user using a recursive approach.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();

            if (n < 0) {
                n = -n;
            }

            long sum = sumOfDigits(n);
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }

    private static long sumOfDigits(long n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
