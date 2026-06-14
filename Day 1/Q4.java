import java.util.*;


// This program counts the number of digits in a given integer input by the user.
public class Q4 {
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

            do {
                count++;
                n /= 10;
            } while (n != 0);

            System.out.println("Number of digits: " + count);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}