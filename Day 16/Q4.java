import java.util.Scanner;

// This program removes duplicate elements from an array entered by the user.
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

                int[] uniqueArray = removeDuplicates(array);

                System.out.print("Array after removing duplicates: ");
                for (int i = 0; i < uniqueArray.length; i++) {
                    System.out.print(uniqueArray[i] + " ");
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

    private static int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean exists = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == array[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                temp[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = temp[i];
        }
        return uniqueArray;
    }
}
