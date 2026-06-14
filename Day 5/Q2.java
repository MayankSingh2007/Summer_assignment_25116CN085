import java.util.*;

// This program checks if a given integer is a perfect number, which is a number that is equal to the sum of its proper divisors (excluding itself).
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n >= 0) {
                int originalNumber = n;
                int sum = 0;
                int temp = n;

                while (temp != 0) {
                    int digit = temp % 10;
                    sum += factorial(digit);
                    temp /= 10;
                }

                if (originalNumber == 0) {
                    sum = 1;
                }

                if (sum == originalNumber) {
                    System.out.println(originalNumber + " is a strong number.");
                } else {
                    System.out.println(originalNumber + " is not a strong number.");
                }
            } else {
                System.out.println("Invalid input: number must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }

    private static int factorial(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
