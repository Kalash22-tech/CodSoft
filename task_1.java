import java.util.Random;
import java.util.Scanner;

class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;
        System.out.println("WELCOME TO THE NUMBER GAME!");

        do {
            int attempts = 0;
            int maxAttempts = 6;
            int randomNumber = random.nextInt(100) + 1;
            boolean guessedCorrectly = false;
            System.out.println("A random number between 1 and 100 has been generated.");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;
                if (userGuess == randomNumber) {
                    System.out.println("CONGRATULATIONS! You guessed the correct number.");
                    score += (maxAttempts - attempts + 1);
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
                System.out.println("Remaining attempts: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("Better luck next time! The correct number was " + randomNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score is: " + score);
        System.out.println("THANK YOU FOR PLAYING!");
        sc.close();
    }
}
