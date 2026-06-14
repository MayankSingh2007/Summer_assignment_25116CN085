import java.math.BigInteger;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n >= 0) {
                BigInteger factorial = BigInteger.ONE;

                for (int i = 2; i <= n; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }

                System.out.println("Factorial of " + n + " is: " + factorial);
            } else {
                System.out.println("Invalid input: number must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}