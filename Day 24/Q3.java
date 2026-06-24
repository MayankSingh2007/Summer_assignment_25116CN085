import java.util.Scanner;

// This program finds the longest word in a sentence.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest Word: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        sc.close();
    }
}