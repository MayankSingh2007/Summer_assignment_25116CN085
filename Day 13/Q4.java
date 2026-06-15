import java.util.Scanner;

// This program counts the even and odd elements in an array entered by the user.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            if (size > 0) {
                int[] array = new int[size];
                int evenCount = 0;
                int oddCount = 0;

                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Enter element " + (i + 1) + " again: ");
                        scanner.next();
                    }
                    array[i] = scanner.nextInt();

                    if (array[i] % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }

                System.out.println("Even elements count: " + evenCount);
                System.out.println("Odd elements count: " + oddCount);
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}