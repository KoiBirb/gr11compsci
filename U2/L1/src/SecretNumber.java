import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean correctGuess = false;
        int secretNumber = random.nextInt(10);

        while (!correctGuess){
            System.out.println("Guess the number: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Just right");
                correctGuess = true;
            }
            else if (guess > secretNumber)System.out.println("To high");
            else System.out.println("To low");
        }
    }
}
