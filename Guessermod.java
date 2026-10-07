import java.util.Random;
import java.util.Scanner;

public class Guessermod {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        
        
        check(number, in, 1);
        
        in.close();
    }

    public static void check(int number, Scanner in, int attempts) {
        System.out.print("Type a number: ");
        int guess = in.nextInt();

        if (guess == number) {
            System.out.println("Correct! You guessed the secret number!");
        } else {
            
            if (guess > number) {
                System.out.println("Guess too high!");
            } else {
                System.out.println("Guess too low!");
            }

           
            int diff = guess - number;
            System.out.println("You were off by: " + diff);

  
            if (attempts < 3) {
                System.out.println("Try again!\n");
                check(number, in, attempts + 1); 
            } else {
                System.out.println("\nGame over! You've used all 3 attempts.");
                System.out.println("The number I was thinking of was: " + number);
            }
        }
    }
}
