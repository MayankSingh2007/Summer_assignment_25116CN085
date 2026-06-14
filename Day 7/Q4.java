import java.util.*;

// This program calculates the sum of the digits of a given integer input by the user using a recursive approach.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();
            boolean isNegative = n < 0;
            long reversed = reverse(Math.abs(n), 0);

            if (isNegative) {
                reversed = -reversed;
            }

            System.out.println("Reversed number: " + reversed);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }

    private static long reverse(long n, long reversed) {
        if (n == 0) {
            return reversed;
        }
        return reverse(n / 10, reversed * 10 + (n % 10));
    }
}
