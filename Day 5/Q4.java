import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();

            if (n <= 1) {
                System.out.println("Invalid input: number must be greater than 1.");
            } else {
                long number = n;
                long largestPrimeFactor = -1;

                while (number % 2 == 0) {
                    largestPrimeFactor = 2;
                    number /= 2;
                }

                for (long i = 3; i * i <= number; i += 2) {
                    while (number % i == 0) {
                        largestPrimeFactor = i;
                        number /= i;
                    }
                }

                if (number > 2) {
                    largestPrimeFactor = number;
                }

                System.out.println("Largest prime factor of " + n + " is: " + largestPrimeFactor);
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
