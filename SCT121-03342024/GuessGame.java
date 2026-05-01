import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate random number between 1 and 50
        int number = (int)(Math.random() * 50) + 1;

        int guess = 0; // Stores user's guess
        int attempts = 0; // Counts attempts

        System.out.println("Guess a number between 1 and 50");

        // Loop until user guesses correctly
        while (guess != number) {

            System.out.print("Enter guess: ");
            guess = input.nextInt();
            attempts++; // Increase attempt count

            // Check guess
            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
            }
        }
    }
}
    

