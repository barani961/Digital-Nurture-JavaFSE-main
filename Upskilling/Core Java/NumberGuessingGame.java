import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //generate random num bw 1-100
        int number =random.nextInt(100)+1;
        int guess;
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) 
                System.out.println("Too high");
            
            else if (guess < number) 
                System.out.println("Too low");
            
            else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }
    }
}