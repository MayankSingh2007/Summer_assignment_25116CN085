import java.util.LinkedHashMap;
import java.util.Map;

// This program finds the first non-repeating character in a given string.
public class Q1 {
    public static void main(String[] args) {
        String input = "aabbcde";
        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }
}
