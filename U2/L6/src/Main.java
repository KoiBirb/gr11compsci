import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
                continue;
            }
            System.out.println("Odd");
        }

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = rand.nextInt(1, 11);
        int guessCount = 10;

        while (guessCount > 0) {
            System.out.println("You have " + guessCount + " guesses left.");
            System.out.println("Enter a number between 1 and 10: ");
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("You guessed the number!");
                break;
            } else if (guess < number) {
                System.out.println("The number is higher.");
            } else {
                System.out.println("The number is lower.");
            }
            guessCount--;
        }

        boolean keepGoing = true;
        double cumulativeScore = 0;
        double divisor = 0;

        while (keepGoing) {
            System.out.println("Enter a test score [999 to quit]: ");
            int input = scanner.nextInt();
            cumulativeScore += input;
            if (input == 999) {
                keepGoing = false;
            }
            divisor++;
        }
        System.out.println("Your score is: " + cumulativeScore / divisor + "%");
    }
}