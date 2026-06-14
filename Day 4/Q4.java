import java.util.*;

public class Q4 {
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

                System.out.println("Armstrong numbers in the range " + start + " to " + end + ":");

                for (int number = start; number <= end; number++) {
                    if (number >= 0) {
                        int digits = 0;
                        int temp = number;

                        if (temp == 0) {
                            digits = 1;
                        } else {
                            while (temp != 0) {
                                digits++;
                                temp /= 10;
                            }
                        }

                        int sum = 0;
                        temp = number;

                        if (temp == 0) {
                            sum = 0;
                        } else {
                            while (temp != 0) {
                                int digit = temp % 10;
                                sum += (int) Math.pow(digit, digits);
                                temp /= 10;
                            }
                        }

                        if (number == sum) {
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
