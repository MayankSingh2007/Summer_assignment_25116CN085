import java.util.Scanner;

// This program finds the element with the maximum frequency in an array entered by the user.
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

                int maxFrequencyElement = array[0];
                int maxFrequency = 1;

                for (int i = 0; i < size; i++) {
                    int frequency = 0;
                    for (int j = 0; j < size; j++) {
                        if (array[i] == array[j]) {
                            frequency++;
                        }
                    }

                    if (frequency > maxFrequency) {
                        maxFrequency = frequency;
                        maxFrequencyElement = array[i];
                    }
                }

                System.out.println("Element with maximum frequency: " + maxFrequencyElement);
                System.out.println("Maximum frequency: " + maxFrequency);
            } else {
                System.out.println("Please enter a positive array size.");
            }
        } else {
            System.out.println("Invalid input: please enter a valid integer.");
        }

        scanner.close();
    }
}
