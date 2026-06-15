import java.util.Scanner;

// This program finds a pair of elements in an array whose sum is equal to a given value.
public class Q3 {
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

                System.out.print("Enter target sum: ");
                if (scanner.hasNextInt()) {
                    int target = scanner.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size - 1 && !found; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (array[i] + array[j] == target) {
                                System.out.println("Pair found: " + array[i] + " and " + array[j]);
                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("No pair found with the given sum.");
                    }
                } else {
                    System.out.println("Invalid input: please enter a valid integer for the target sum.");
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
