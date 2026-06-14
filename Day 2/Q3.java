import java.util.*;

// This program generates and displays the multiplication table for a given positive integer input by the user.
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

            long product = 1;

            if (n == 0) {
                product = 0;
            } else {
                while (n != 0) {
                    product *= n % 10;
                    n /= 10;
                }
            }

            System.out.println("Product of digits: " + product);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}