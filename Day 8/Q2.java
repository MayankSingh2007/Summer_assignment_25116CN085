import java.util.*;

// This program generates a right-angled triangle pattern of asterisks (*) based on the number of rows specified by the user.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int rows = scanner.nextInt();

            if (rows > 0) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input: number of rows must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
