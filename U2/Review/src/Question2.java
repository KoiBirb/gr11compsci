import java.util.Random;
import java.util.Scanner;

// RandomNum
public class Question2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guesses = 0;
        boolean keepPlaying = true;

        System.out.print("What is the maximum number?: ");
        int max = scanner.nextInt();
        System.out.println("What is the minimum number?: ");
        int min = scanner.nextInt();

        int randomNum = random.nextInt(max - min) + min;

        System.out.println("The random number is: " + randomNum);

        while (keepPlaying){
            System.out.println("Guess a number between " + min + " and " + max);
            int guess = scanner.nextInt();
            if (guess == randomNum){
                System.out.println("You guessed the number!");
                keepPlaying = false;
            } else if (guess < randomNum){
                System.out.println("The number is higher");
            } else {
                System.out.println("The number is lower");
            }
        }

        System.out.println("It took you " + guesses + " guesses to get the number");
        scanner.close();
    }
}

