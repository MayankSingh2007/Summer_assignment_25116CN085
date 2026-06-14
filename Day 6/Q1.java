import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        boolean isValidInput = scanner.hasNextLong();

        if (isValidInput) {
            long n = scanner.nextLong();

            if (n >= 0) {
                if (n == 0) {
                    System.out.println("Binary equivalent: 0");
                } else {
                    StringBuilder binary = new StringBuilder();
                    long number = n;

                    while (number > 0) {
                        binary.append(number % 2);
                        number /= 2;
                    }

                    binary.reverse();
                    System.out.println("Binary equivalent: " + binary);
                }
            } else {
                System.out.println("Invalid input: number must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
