import java.util.Scanner;

// This program checks whether a given number is a perfect number by comparing it with the sum of its proper divisors.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                if (isPerfectNumber(number)) {
                    System.out.println(number + " is a perfect number.");
                } else {
                    System.out.println(number + " is not a perfect number.");
                }
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
