import java.util.Scanner;

// This program sorts an array using selection sort.
public class Q2 {
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

                selectionSort(array);

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

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
