import java.util.*;

// This program calculates the power of a given base number raised to a specified exponent input by the user.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        boolean isValidBase = scanner.hasNextDouble();

        if (isValidBase) {
            double x = scanner.nextDouble();

            System.out.print("Enter the exponent: ");
            boolean isValidExponent = scanner.hasNextInt();

            if (isValidExponent) {
                int n = scanner.nextInt();
                double result = 1;
                int power = Math.abs(n);

                for (int i = 0; i < power; i++) {
                    result *= x;
                }

                if (n < 0) {
                    result = 1 / result;
                }

                System.out.println(x + " raised to the power " + n + " is: " + result);
            } else {
                System.out.println("Invalid input: please enter an integer exponent.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid number for the base.");
        }

        scanner.close();
    }
}
