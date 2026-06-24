import java.util.Scanner;

// This program compresses a string by replacing consecutive repeating characters with the character followed by the count of repetitions.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            count = 1;

            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed += str.charAt(i) + "" + count;
        }

        System.out.println("Compressed String: " + compressed);

        sc.close();
    }
}