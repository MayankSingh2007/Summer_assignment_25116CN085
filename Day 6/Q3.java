import java.util.*;

// This program counts the number of set bits (1s) in the binary representation of a given integer input by the user.
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

            int count = 0;
            long number = n;

            while (number != 0) {
                count += (number & 1L);
                number >>= 1;
            }

            System.out.println("Number of set bits: " + count);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
