import java.util.Scanner;

// This program sorts an array using bubble sort.
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

                bubbleSort(array);

                System.out.print("Sorted array: ");
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

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
