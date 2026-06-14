import java.util.*;

// This program converts a given binary number input by the user into its decimal equivalent.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        if (binary.matches("[01]+")) {
            long decimal = 0;

            for (int i = 0; i < binary.length(); i++) {
                decimal = decimal * 2 + (binary.charAt(i) - '0');
            }

            System.out.println("Decimal equivalent: " + decimal);
        } else {
            System.out.println("Invalid input: please enter a valid binary number.");
        }

        scanner.close();
    }
}
