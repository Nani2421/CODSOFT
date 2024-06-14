import java.util.Random;
import java.util.Scanner;

public class numberGame { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int maxAttempts = 8;
        int numRounds = 1;
        int totalWins = 0;

        String playAgain;
        do {
            int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            
            int attempts = 0; 
            System.out.println("Number Game - Round " + numRounds);
            System.out.println("Guess a number between " + minNumber + " and " + maxNumber + " (Max Attempts: " + maxAttempts + "):");

            do {
                int guess = scanner.nextInt();

                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    totalWins++;
                    break;
                }
                else if (guess > randomNumber) {
                    System.out.println("Too high! Guess lower.");
                }
                else {
                    System.out.println("Too low! Guess higher.");
                }
            } while (attempts < maxAttempts);

            if (attempts == maxAttempts) {
                System.out.println("You ran out of attempts. The number was: " + randomNumber);
            }

            System.out.println("Play again? (yes - y / no - n):");
            playAgain = scanner.next();
            numRounds++;
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing! Your score: " + totalWins + " wins out of " + ( numRounds -1 )+ " rounds.");
        scanner.close();
    }
}
