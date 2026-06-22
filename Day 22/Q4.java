import java.util.Scanner;

// This program removes all spaces from a string.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("String without spaces: " + result);
        scanner.close();
    }
}
