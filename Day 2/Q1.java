import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();

            if (n < 0) {
                n = -n;
            }

            long sum = 0;

            do {
                sum += n % 10;
                n /= 10;
            } while (n != 0);

            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}