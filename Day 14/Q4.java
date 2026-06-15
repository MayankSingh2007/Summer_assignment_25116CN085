import java.util.Scanner;

// This program finds duplicate elements in an array entered by the user.
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

                boolean foundDuplicate = false;
                System.out.println("Duplicate elements are:");

                for (int i = 0; i < size; i++) {
                    boolean alreadyPrinted = false;

                    for (int k = 0; k < i; k++) {
                        if (array[i] == array[k]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (alreadyPrinted) {
                        continue;
                    }

                    int count = 0;
                    for (int j = 0; j < size; j++) {
                        if (array[i] == array[j]) {
                            count++;
                        }
                    }

                    if (count > 1) {
                        System.out.println(array[i] + " appears " + count + " times");
                        foundDuplicate = true;
                    }
                }

                if (!foundDuplicate) {
                    System.out.println("No duplicate elements found.");
                }
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}