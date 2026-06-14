import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        boolean isValidFirst = scanner.hasNextInt();

        if (isValidFirst) {
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            boolean isValidSecond = scanner.hasNextInt();

            if (isValidSecond) {
                int b = scanner.nextInt();

                int first = Math.abs(a);
                int second = Math.abs(b);

                if (first == 0 || second == 0) {
                    System.out.println("LCM of the two numbers is: 0");
                } else {
                    int x = first;
                    int y = second;

                    while (y != 0) {
                        int temp = y;
                        y = x % y;
                        x = temp;
                    }

                    long lcm = (long) first * second / x;
                    System.out.println("LCM of the two numbers is: " + lcm);
                }
            } else {
                System.out.println("Invalid input: please enter an integer for the second number.");
            }
        } else {
            System.out.println("Invalid input: please enter an integer for the first number.");
        }

        scanner.close();
    }
}
