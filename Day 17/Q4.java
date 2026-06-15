import java.util.Scanner;

// This program finds common elements in two arrays entered by the user.
public class Q4 {
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
                    int[] commonArray = new int[Math.min(size1, size2)];
                    int commonSize = 0;

                    for (int i = 0; i < size1; i++) {
                        System.out.print("Enter element " + (i + 1) + " of first array: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Invalid input. Enter element " + (i + 1) + " of first array again: ");
                            scanner.next();
                        }
                        firstArray[i] = scanner.nextInt();
                    }

                    for (int i = 0; i < size2; i++) {
                        System.out.print("Enter element " + (i + 1) + " of second array: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Invalid input. Enter element " + (i + 1) + " of second array again: ");
                            scanner.next();
                        }
                        secondArray[i] = scanner.nextInt();
                    }

                    for (int i = 0; i < size1; i++) {
                        if (contains(secondArray, size2, firstArray[i]) && !contains(commonArray, commonSize, firstArray[i])) {
                            commonArray[commonSize] = firstArray[i];
                            commonSize++;
                        }
                    }

                    if (commonSize > 0) {
                        System.out.print("Common elements: ");
                        for (int i = 0; i < commonSize; i++) {
                            System.out.print(commonArray[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("No common elements found.");
                    }
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

    private static boolean contains(int[] array, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
