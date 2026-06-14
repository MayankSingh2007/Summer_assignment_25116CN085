import java.util.*;

// This program calculates the greatest common divisor (GCD) of two integers input by the user using the Euclidean algorithm.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        boolean isValidFirst = scanner.hasNextInt();

        if (isValidFirst) {
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            boolean isValidSecond = scanner.hasNextInt();

            if (isValidSecond) {
                int b = scanner.nextInt();

                a = Math.abs(a);
                b = Math.abs(b);

                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }

                System.out.println("GCD of the two numbers is: " + a);
            } else {
                System.out.println("Invalid input: please enter an integer for the second number.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer for the first number.");
        }

        scanner.close();
    }
}
