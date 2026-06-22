import java.util.Scanner;

// This program calculates the length of a string.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = 0;
        for (char ignored : input.toCharArray()) {
            length++;
        }

        System.out.println("String length: " + length);
        scanner.close();
    }
}
