/*
Rock paper scissors game
Leo Bogaert
March 27, 2024,
Chose rock paper or scissors and see if you can win against the computer!
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int playerChoice = 0, computerChoice, playerScore = 0,
                computerScore = 0, round = 0, effectiveRound = 0;
        String play;
        boolean playAgain = true, validInput = false;

        // Array to map the number choice to a word
        String[] choicesArray = {"","ROCK", "PAPER", "SCISSORS"};
        int[] choicesCounter = {0, 0, 0};
        System.out.println("Let’s Play Rock Paper Scissors!!");

        //Main game loop
        while (playAgain) {
            round++;
            //Prints the game menu
            printChoices(false);

            //Input validation
            do {
                try {
                    playerChoice = scanner.nextInt();
                    if (playerChoice < 1 || playerChoice > 3) printChoices(true);
                    else validInput = true;
                } catch (InputMismatchException e) {
                    printChoices(true);
                    scanner.next();
                }
            } while (!validInput);

            // Get random computer choice
            computerChoice = rand.nextInt(3) + 1;

            // Increment the choice counter depending on the player choice
            choicesCounter[playerChoice]++;

            //Prints the player and computer choices
            System.out.println(choicesArray[playerChoice] + " vs. ... " + choicesArray[computerChoice] + "!");

            // Check who wins
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if (playerChoice == 1 && computerChoice == 3 || playerChoice == 2 && computerChoice == 1) {
                System.out.println("You win!");
                playerScore++;
                effectiveRound++;
            } else {
                System.out.println("You lose!");
                computerScore++;
                effectiveRound++;
            }

            // Ask if the player wants to play again
            System.out.print("Would you like to play again? [y]es or [n]o: ");
            play = scanner.next().toLowerCase().trim();

            // Input validation
            while (!play.equals("y") && !play.equals("n")) {
                System.out.println("Invalid - please choose only [y]es or [n]o.");
                System.out.print("Would you like to play again? [y]es or [n]o: ");
                play = scanner.next().toLowerCase().trim();
            }

            if (play.equals("n")) playAgain = false;
        }

        //Prints the final stats
        System.out.println("""
                ====================================================
                Final Stats
                ====================================================""");

        System.out.println("Rounds played: " + round);
        //Format percentages
        System.out.printf("Number of games Won: %d (%.2f%%)\n", playerScore, ((double) playerScore / effectiveRound) * 100.0);
        System.out.printf("Number of games Lost: %d (%.2f%%)\n", computerScore, ((double) computerScore / effectiveRound) * 100.0);
        // Account for equal choices

        int rock = choicesCounter[0], paper = choicesCounter[1], scissors = choicesCounter[2];
        if(rock == paper && rock < scissors){
            System.out.println("\nMost common choice: ROCK and PAPER");
        } else if (paper == scissors && paper < rock){
            System.out.println("\nMost common choice: SCISSORS and PAPER");
        } else if (rock == scissors && rock < paper){
            System.out.println("\nMost common choice: ROCK and SCISSORS");
        } else {
            // print the most common choice
            System.out.println("\nMost common choice: " + (rock > paper && rock > scissors ? "ROCK" : paper > rock && paper > scissors ? "PAPER" : "SCISSORS"));
        }
        scanner.close();
    }

    private static void printChoices(boolean invalid){
        if (invalid) System.out.println("Invalid - please choose only 1, 2, or 3.");
        System.out.println("""
                    ====================================================
                    Choose your throw: 1 = ROCK, 2 = PAPER, 3 = SCISSORS""");
        System.out.print("You choose: ");
    }
}