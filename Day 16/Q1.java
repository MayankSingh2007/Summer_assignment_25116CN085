import java.util.Scanner;

// This program finds the missing number in an array containing numbers from 1 to n.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n > 1) {
                int[] array = new int[n - 1];
                int sum = 0;

                for (int i = 0; i < array.length; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Enter element " + (i + 1) + " again: ");
                        scanner.next();
                    }
                    array[i] = scanner.nextInt();
                    sum += array[i];
                }

                int expectedSum = n * (n + 1) / 2;
                int missingNumber = expectedSum - sum;

                System.out.println("Missing number is: " + missingNumber);
            } else {
                System.out.println("Please enter a value of n greater than 1.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}
