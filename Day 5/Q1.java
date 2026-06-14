import java.util.*;

// This program checks if a given integer is a perfect number, which is a number that is equal to the sum of its proper divisors (excluding itself).
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n > 0) {
                int sum = 0;

                for (int i = 1; i <= n / 2; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }

                if (sum == n) {
                    System.out.println(n + " is a perfect number.");
                } else {
                    System.out.println(n + " is not a perfect number.");
                }
            } else {
                System.out.println("Invalid input: number must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
