import java.util.*;

// This program generates a right-angled triangle pattern of letters based on the number of rows specified by the user.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int rows = scanner.nextInt();

            if (rows >= 2) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows; j++) {
                        if (i == 1 || i == rows || j == 1 || j == rows) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input: number of rows must be at least 2.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
