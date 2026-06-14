import java.util.*;

// This program generates and displays the multiplication table for a given positive integer input by the user.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n > 0) {
                System.out.println("Multiplication Table of " + n + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
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