import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n <= 1) {
                System.out.println(n + " is not a prime number.");
            } else {
                boolean isPrime = true;

                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n + " is a prime number.");
                } else {
                    System.out.println(n + " is not a prime number.");
                }
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
