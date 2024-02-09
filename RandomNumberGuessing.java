import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
	int maxAttempts=5;
	int attempts = 0;
	boolean hasGuessed = false;
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");
	System.out.println("You have " + maxAttempts + " trials to guess it.");
        while (attempts < maxAttempts && !hasGuessed) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
		hasGuessed = true;
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }
	if (!hasGuessed) {
            System.out.println("Sorry, you've exhausted all your trials. The number was: " + numberToGuess);
        }
        scanner.close();
    }
}