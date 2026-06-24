import java.util.LinkedHashSet;

// This program finds the first repeating character in a given string.
public class Q2 {
    public static void main(String[] args) {
        String input = "aabbcde";
        char result = findFirstRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
    }

    public static char findFirstRepeatingChar(String str) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        LinkedHashSet<Character> repeated = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                repeated.add(ch);
            }
        }

        for (char ch : str.toCharArray()) {
            if (repeated.contains(ch)) {
                return ch;
            }
        }

        return '\0';
    }
}
