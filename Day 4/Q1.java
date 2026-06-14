import java.util.*;

// This program generates and displays the Fibonacci series up to a specified number of terms provided by the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int terms = scanner.nextInt();

            if (terms > 0) {
                int first = 0;
                int second = 1;

                System.out.println("Fibonacci series:");

                if (terms >= 1) {
                    System.out.print(first);
                }
                if (terms >= 2) {
                    System.out.print(" " + second);
                }

                for (int i = 3; i <= terms; i++) {
                    int next = first + second;
                    System.out.print(" " + next);
                    first = second;
                    second = next;
                }

                System.out.println();
            } else {
                System.out.println("Invalid input: number of terms must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
