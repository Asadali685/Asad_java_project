import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have Selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.println("Enter your guess: ");        
            userGuess = scanner.nextInt();

            if (userGuess > numberToGuess){
                System.out.println("Too! high Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low Try again.");
            } else {
                System.out.println("Congratulations! You guessed the right number: " + numberToGuess);
            }
        }

        scanner.close();
    }
}
