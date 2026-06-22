import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// This program counts the frequency of each character in a string.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequency:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getKey() == ' ') {
                System.out.println("[space] = " + entry.getValue());
            } else {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        scanner.close();
    }
}
