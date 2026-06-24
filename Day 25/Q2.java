import java.util.Scanner;

// This program finds the common characters between two strings.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Common Characters: ");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }

        sc.close();
    }
}