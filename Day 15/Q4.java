import java.util.Scanner;

// This program moves all zeroes in an array to the end while keeping the order of non-zero elements.
public class Q4 {
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

                moveZeroesToEnd(array);

                System.out.print("Array after moving zeroes to end: ");
                for (int value : array) {
                    System.out.print(value + " ");
                }
                System.out.println();
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }

    private static void moveZeroesToEnd(int[] array) {
        int insertPosition = 0;

        for (int value : array) {
            if (value != 0) {
                array[insertPosition] = value;
                insertPosition++;
            }
        }

        while (insertPosition < array.length) {
            array[insertPosition] = 0;
            insertPosition++;
        }
    }
}
