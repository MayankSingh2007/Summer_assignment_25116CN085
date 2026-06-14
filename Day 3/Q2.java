import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of range: ");
        boolean isValidStart = scanner.hasNextInt();

        if (isValidStart) {
            int start = scanner.nextInt();

            System.out.print("Enter the ending number of range: ");
            boolean isValidEnd = scanner.hasNextInt();

            if (isValidEnd) {
                int end = scanner.nextInt();

                if (start > end) {
                    int temp = start;
                    start = end;
                    end = temp;
                }

                System.out.println("Prime numbers in the range " + start + " to " + end + ":");

                for (int number = start; number <= end; number++) {
                    if (number >= 2) {
                        boolean isPrime = true;

                        for (int divisor = 2; divisor * divisor <= number; divisor++) {
                            if (number % divisor == 0) {
                                isPrime = false;
                                break;
                            }
                        }

                        if (isPrime) {
                            System.out.print(number + " ");
                        }
                    }
                }

                System.out.println();
            } else {
                System.out.println("Invalid input: please enter an integer for the ending number.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer for the starting number.");
        }

        scanner.close();
    }
}
