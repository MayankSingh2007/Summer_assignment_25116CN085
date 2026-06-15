import java.util.Scanner;

// This program merges two arrays entered by the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        if (scanner.hasNextInt()) {
            int size1 = scanner.nextInt();

            System.out.print("Enter size of second array: ");
            if (scanner.hasNextInt()) {
                int size2 = scanner.nextInt();

                if (size1 > 0 && size2 > 0) {
                    int[] firstArray = new int[size1];
                    int[] secondArray = new int[size2];
                    int[] mergedArray = new int[size1 + size2];

                    for (int i = 0; i < size1; i++) {
                        System.out.print("Enter element " + (i + 1) + " of first array: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Invalid input. Enter element " + (i + 1) + " of first array again: ");
                            scanner.next();
                        }
                        firstArray[i] = scanner.nextInt();
                        mergedArray[i] = firstArray[i];
                    }

                    for (int i = 0; i < size2; i++) {
                        System.out.print("Enter element " + (i + 1) + " of second array: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Invalid input. Enter element " + (i + 1) + " of second array again: ");
                            scanner.next();
                        }
                        secondArray[i] = scanner.nextInt();
                        mergedArray[size1 + i] = secondArray[i];
                    }

                    System.out.print("Merged array: ");
                    for (int value : mergedArray) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Please enter positive sizes for both arrays.");
                }
            } else {
                System.out.println("Invalid input: please enter a valid integer for the second array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer for the first array size.");
        }

        scanner.close();
    }
}
