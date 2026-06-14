import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean isValidInput = scanner.hasNextInt();

        if (isValidInput) {
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Armstrong check is not applicable for negative numbers.");
            } else {
                int originalNumber = n;
                int sum = 0;
                int digits = 0;
                int temp = n;

                if (temp == 0) {
                    digits = 1;
                } else {
                    while (temp != 0) {
                        digits++;
                        temp /= 10;
                    }
                }

                temp = n;
                while (temp != 0) {
                    int digit = temp % 10;
                    sum += (int) Math.pow(digit, digits);
                    temp /= 10;
                }

                if (originalNumber == 0) {
                    sum = 0;
                }

                if (originalNumber == sum) {
                    System.out.println(originalNumber + " is an Armstrong number.");
                } else {
                    System.out.println(originalNumber + " is not an Armstrong number.");
                }
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
