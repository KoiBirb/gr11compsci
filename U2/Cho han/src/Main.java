import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int points = 50;
        int die1, die2, sum, gamesPlayed = 1, win = 0, lose = 0, cho = 0, han = 0;
        boolean keepGoing = true, isEven;
        String guess, playAgain;

        // Rules
        System.out.println("""
                The Game of Cho-Han
                ======================================================
                HOW TO PLAY:
                2 dice are rolled. You must choose whether you think
                the total is even (cho) or odd (han). If you are
                correct, you will win 10 points. If you are incorrect,
                you lose 10 points.
                ======================================================""");

        // Main game loop
        while (keepGoing && points > 0) {
            System.out.println("You have " + points + " points.");
            System.out.println("""
                    You swirl the cup and hear the rattle of dice...
                    You slam the cup on the floor, still covering the dice.
                    ======================================================""");

            // Ask for guess
            System.out.print("CHO (even) or HAN (odd): ");
            guess = scanner.next().trim().toLowerCase();
            // Check for valid input
            while (!Objects.equals(guess, "cho")
                    && !Objects.equals(guess, "han")) {
                System.out.println("Invalid input. Please enter 'cho' or 'han'.");
                System.out.print("CHO (even) or HAN (odd): ");
                guess = scanner.next().trim().toLowerCase();
            }

            System.out.println("""
                    ======================================================
                    You lift the cup to reveal...""");

            // Roll dice and calculate sum
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            sum = die1 + die2;
            System.out.println(die1 + " + " + die2 + " = " + sum);
            // Determine if sum is even or odd
            isEven = sum % 2 == 0;

            // Determine if guess is correct
            switch (guess) {
                case "cho":
                    cho++;
                    if (isEven) {
                        System.out.println("You win 10 points!");
                        win++;
                        points += 10;
                    } else {
                        System.out.println("You lose 10 points!");
                        lose++;
                        points -= 10;
                    }
                    break;
                case "han":
                    han++;
                    if (!isEven) {
                        System.out.println("You win 10 points!");
                        win++;
                        points += 10;
                    } else {
                        System.out.println("You lose 10 points!");
                        lose++;
                        points -= 10;
                    }
                    break;
            }

            // Ask to play again
            System.out.print("Would you like to play again [y/n]: ");
            playAgain = scanner.next().trim().toLowerCase();
            // Check for valid input
            while (!Objects.equals(playAgain, "y")
                    && !Objects.equals(playAgain, "n")) {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
                System.out.print("Would you like to play again [y/n]: ");
                playAgain = scanner.next().trim().toLowerCase();
            }

            // Check if game should continue
            if (Objects.equals(playAgain, "n")) keepGoing = false;
            else {
                System.out.println("======================================================");
                gamesPlayed++;
            }
        }

        // Final statistics
        System.out.println("""
                 ======================================================
                         FINAL STATISTICS
                 ======================================================""");
        System.out.println("Final Score: " + points + " points");
        System.out.println("Total Games Played: " + gamesPlayed);
        System.out.println("Win: " + win + " (" + ((double) win / gamesPlayed * 100.0) + "%)");
        System.out.println("Lose: " + lose + " (" + ((double) lose / gamesPlayed * 100.0) + "%)");
        System.out.println("Most Common Move: " + (cho > han ? "CHO" : "HAN"));
        System.out.println("Thank you for playing Cho-Han.");
    }
}