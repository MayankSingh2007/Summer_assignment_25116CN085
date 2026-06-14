import java.util.*;

// This program calculates the nth term of the Fibonacci sequence based on user input for the position of the term.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position of Fibonacci term: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input: position must be a positive integer.");
            } else if (n == 1) {
                System.out.println("The 1st Fibonacci term is: 0");
            } else if (n == 2) {
                System.out.println("The 2nd Fibonacci term is: 1");
            } else {
                long first = 0;
                long second = 1;
                long term = 0;

                for (int i = 3; i <= n; i++) {
                    term = first + second;
                    first = second;
                    second = term;
                }

                System.out.println("The " + n + "th Fibonacci term is: " + term);
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
