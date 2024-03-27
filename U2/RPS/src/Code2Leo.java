/*
Rock paper scissors game
Leo Bogaert
March 27, 2024,
Chose rock paper or scissors and see if you can win against the computer!
 */

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Code2Leo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int playerChoice = -1, computerChoice, playerScore = 0,
                computerScore = 0, rock = 0, paper = 0, scissors = 0, round = 0, effectiveRound = 0;
        String play = "";
        boolean playAgain = true;

        // HashMap to map the number choice to a word
        HashMap<Integer, String> choices = new HashMap<>();
        choices.put(1, "ROCK");
        choices.put(2, "PAPER");
        choices.put(3, "SCISSORS");

        //Main game loop
        while (playAgain) {
            round++;
            //Prints the game menu
            System.out.println("""
                    Let’s Play Rock Paper Scissors!!
                    ====================================================
                    Choose your throw: 1 = ROCK, 2 = PAPER, 3 = SCISSORS""");
            System.out.print("You choose: ");

            //Input validation
            do {
                playerChoice = scanner.nextInt();

                if (playerChoice != -1 && playerChoice < 1 || playerChoice > 3) {
                    System.out.println("""
                            Invalid - please choose only 1, 2, or 3.
                            Let’s Play Rock Paper Scissors!!
                            ====================================================
                            Choose your throw: 1 = ROCK, 2 = PAPER, 3 = SCISSORS""");

                    System.out.print("You choose: ");
                }
            } while (playerChoice < 1 || playerChoice > 3);

            // Get random computer choice
            computerChoice = rand.nextInt(3) + 1;

            // Increment the choice counter depending on the player choice
            switch (playerChoice) {
                case 1:
                    rock++;
                    break;
                case 2:
                    paper++;
                    break;
                case 3:
                    scissors++;
                    break;
            }

            //Prints the player and computer choices
            System.out.println(choices.get(playerChoice) + " vs. ... " + choices.get(computerChoice) + "!");


            // Check who wins
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((playerChoice == 1 && computerChoice == 3)
                    || (playerChoice == 2 && computerChoice == 1)
                    || (playerChoice == 3 && computerChoice == 2)) {
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
        if(rock == paper){
            System.out.println("\nMost common choice: ROCK and PAPER");
        } else if (paper ==scissors){
            System.out.println("\nMost common choice: SCISSORS and PAPER");
        } else if (rock == scissors){
            System.out.println("\nMost common choice: ROCK and SCISSORS");
        } else {
            // print the most common choice
            System.out.println("\nMost common choice: " + (rock > paper && rock > scissors ? "ROCK" : paper > rock && paper > scissors ? "PAPER" : "SCISSORS"));
        }
        scanner.close();
    }
}