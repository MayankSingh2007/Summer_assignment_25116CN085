import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n > 0) {
                System.out.println("Factors of " + n + ":");

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.print(i + " ");
                    }
                }

                System.out.println();
            } else {
                System.out.println("Invalid input: number must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
