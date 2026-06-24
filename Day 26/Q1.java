import java.util.Random;
import java.util.Scanner;


// This program implements a simple number guessing game.
public class Q1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != number);

        sc.close();
    }
}