import java.util.Scanner;

// This program finds the frequency of an element in an array entered by the user.
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

                System.out.print("Enter element to find frequency: ");
                if (scanner.hasNextInt()) {
                    int target = scanner.nextInt();
                    int frequency = frequencyOfElement(array, target);

                    System.out.println("Frequency of " + target + " is: " + frequency);
                } else {
                    System.out.println("Invalid input: please enter a valid integer.");
                }
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }

    private static int frequencyOfElement(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
}
