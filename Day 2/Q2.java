import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();
            long originalNumber = n;

            long reversed = 0;
            if (n < 0) {
                n = -n;
            }

            do {
                reversed = reversed * 10 + (n % 10);
                n /= 10;
            } while (n != 0);

            if (originalNumber < 0) {
                reversed = -reversed;
            }

            System.out.println("Reversed number: " + reversed);
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
