import java.util.Scanner;

// This program finds the second largest element in an array entered by the user.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            if (size > 1) {
                int[] array = new int[size];

                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Enter element " + (i + 1) + " again: ");
                        scanner.next();
                    }
                    array[i] = scanner.nextInt();
                }

                Integer largest = null;
                Integer secondLargest = null;

                for (int value : array) {
                    if (largest == null || value > largest) {
                        secondLargest = largest;
                        largest = value;
                    } else if (value != largest && (secondLargest == null || value > secondLargest)) {
                        secondLargest = value;
                    }
                }

                if (secondLargest != null) {
                    System.out.println("Second largest element: " + secondLargest);
                } else {
                    System.out.println("Second largest element does not exist.");
                }
            } else {
                System.out.println("Please enter an array size greater than 1.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}