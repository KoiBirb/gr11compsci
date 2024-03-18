import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        Random rand = new Random();
        int guessMe = 7;
        int number;

        do {
            number = rand.nextInt(1, 10);
            System.out.println(number);

            if (number == guessMe) {
                System.out.println("You guessed it!");
            } else if (number < guessMe) {
                System.out.println("too low");
            } else {
                System.out.println("too high");
            }
        } while (number != guessMe);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        int counter = 0;
        int cumulativeSum = 0;

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
            cumulativeSum += i;
        }
        System.out.println("The sum is: " + cumulativeSum);

        cumulativeSum = 0;
        while (counter <= x) {
            System.out.println(counter);
            cumulativeSum += counter;
            counter++;
        }
        System.out.println("The sum is: " + cumulativeSum);

        System.out.println("Enter a number: ");
        int y = scanner.nextInt();

        for (int i = 1; i < 100; i++) {
            if(i % y == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Enter a number: ");
        int z = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= z; i++) {
            factorial *= i;
        }
        System.out.println("The factorial is: " + factorial);

        scanner.close();
    }
}