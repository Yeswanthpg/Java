import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int numberOfGuesses;

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            numberOfGuesses = 0;

            System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                numberOfGuesses++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
                    break;
                } else {
                    int difference = Math.abs(randomNumber - guess);
                    System.out.println("Wrong guess! You are " + difference + " steps away from the correct number.");
                    System.out.println("Try again.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();
            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        scanner.close();
    }
}
