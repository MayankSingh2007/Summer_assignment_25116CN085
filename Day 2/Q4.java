import java.util.*;

// This program generates and displays the multiplication table for a given positive integer input by the user.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput= scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();
            long originalNumber = n;

            if (n < 0) {
                System.out.println("Palindrome check is not applicable for negative numbers.");
            } else {
                long reversed = 0;
                long temp = n;

                do {
                    reversed = reversed * 10 + (temp % 10);
                    temp /= 10;
                } while (temp != 0);

                if (originalNumber == reversed) {
                    System.out.println(originalNumber + " is a palindrome number.");
                } else {
                    System.out.println(originalNumber + " is not a palindrome number.");
                }
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}