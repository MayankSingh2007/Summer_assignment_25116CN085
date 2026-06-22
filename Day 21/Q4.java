import java.util.Scanner;

// This program converts a string to uppercase.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String converted = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                converted += (char) (ch - 32);
            } else {
                converted += ch;
            }
        }

        System.out.println("Uppercase string: " + converted);
        scanner.close();
    }
}
