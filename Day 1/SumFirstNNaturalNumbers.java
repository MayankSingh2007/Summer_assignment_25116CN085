import java.util.Scanner;

public class SumFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer Number: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int sum = n * (n + 1) / 2;
                System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
            } else {
                System.out.println("Invalid input: N must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer.");
        }

        scanner.close();
    }
}
