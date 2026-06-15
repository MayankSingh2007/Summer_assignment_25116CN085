import java.util.Scanner;

// This program finds the largest and smallest elements in an array entered by the user.
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

                int largest = array[0];
                int smallest = array[0];

                for (int i = 1; i < size; i++) {
                    if (array[i] > largest) {
                        largest = array[i];
                    }
                    if (array[i] < smallest) {
                        smallest = array[i];
                    }
                }

                System.out.println("Largest element: " + largest);
                System.out.println("Smallest element: " + smallest);
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}
