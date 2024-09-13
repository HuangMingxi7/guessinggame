import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);  // Random number between 0 and 99

        Scanner scan = new Scanner(System.in);
        int guess;
        int guessCount = 0;
        do {
        
            System.out.println("Enter your guess:");
            guess = scan.nextInt();
            guessCount++;
            if (guess < x) {
                System.out.println("Too low!");
                System.out.println("number is " + x);
                System.out.println("your gusee times is " + guessCount);
            } else if (guess > x) {
                System.out.println("Too high!");
                System.out.println("number is " + x);
                System.out.println("your gusee times is " + guessCount);                
            } else {
                System.out.println("Correct! The number was " + x);
                break;  // Exit loop when correct guess is made
            }
        } while (guess != x);  // Exit condition when guess equals x

        // Check how many guesses were made
        if (guessCount <= 7) {
            System.out.println("Very good! You guessed the number in " + guessCount + " tries.");
        } else {
            System.out.println("You guessed the number in " + guessCount + " tries. Keep practicing!");
        }

        scan.close();  // Close the scanner to avoid resource leakse
        
    }
}
