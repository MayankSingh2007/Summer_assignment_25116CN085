import java.util.Scanner;

// This program counts the number of words in a sentence.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = 0;
        String trimmedSentence = sentence.trim();

        if (!trimmedSentence.isEmpty()) {
            String[] words = trimmedSentence.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }
}
