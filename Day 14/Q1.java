import java.util.Scanner;

// This program performs a linear search on an array entered by the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            if (size > 0) {
                int[] array = new int[size];

                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Enter element " + (i + 1) + " again: ");
                        scanner.next();
                    }
                    array[i] = scanner.nextInt();
                }

                System.out.print("Enter element to search: ");
                if (scanner.hasNextInt()) {
                    int target = scanner.nextInt();
                    int position = linearSearch(array, target);

                    if (position != -1) {
                        System.out.println("Element found at position: " + (position + 1));
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                } else {
                    System.out.println("Invalid input: please enter a valid integer to search.");
                }
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
