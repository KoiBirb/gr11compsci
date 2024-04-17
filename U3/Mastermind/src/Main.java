import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        boolean keepGoing = true, validInput = false;
        int round = 0, pegCount = 0, colourCount = 0;
        int[] guess, code;

        // Get number of pegs and colours then initialize code
        System.out.println("Enter the number of pegs (2-8): ");
        while (!validInput) {
            pegCount = scanner.nextInt();
            if (pegCount >= 2 && pegCount <= 8) validInput = true;
            else System.out.println("Invalid input. Please enter a number between 2 and 8.");
        }
        System.out.println("Enter the number of colors (" + pegCount + "-10): ");

        validInput = false;
        while (!validInput) {
            colourCount = scanner.nextInt();
            if (colourCount >= pegCount && colourCount <= 10) validInput = true;
            else System.out.println("Invalid input. Please enter a number between " + pegCount + " and 10.");
        }

        code = getCode(pegCount, colourCount);
        guess = new int[pegCount];

        // Game loop
        while (keepGoing){
            // Increment round and get user input
            round++;
            for (int i = 0; i < pegCount; i++) {
                System.out.print("Colour for peg " + (i + 1) + ": ");
                guess[i] = scanner.nextInt();
            }
            // Check if user has won
            if (checkWin(guess, code)) keepGoing = false;
            else getClues(guess, code);
        }
        System.out.println("You guessed the code in " + round + " turns.");
        System.out.println("Thanks for playing!\n");
    }

    /**
     * Generates a random un-repeating code for the user to guess
     * @param pegCount int number of pegs
     * @param colourCount int number of colours
     * @return int[] of random digits
     */
    public static int[] getCode(int pegCount, int colourCount) {
        int[] code = new int[pegCount];
        int[] colours = new int[colourCount];
        for (int i = 0; i < colourCount; i++) {
            colours[i] = i;
        }

        for (int i = 0; i < pegCount; i++) {
            int randNum = rand.nextInt(colourCount);
            while (colours[randNum] == -1) {
                randNum = rand.nextInt(colourCount);
            }
            code[i] = colours[randNum];
            colours[randNum] = -1;
        }
        return code;
    }

    /**
     * Checks if the user has won the game
     * @param guess int[] user's guess
     * @param code int[] code to guess
     * @return boolean true if user has won
     */
    public static boolean checkWin(int[] guess, int[] code){
        for(int i = 0; i < guess.length; i++){
            if(guess[i] != code[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * Prints the number of pegs and colours correct in users guess
     * @param guess int[] user's guess
     * @param code int[] code to guess
     */
    public static void getClues(int[] guess, int[] code){
        int pegsCorrect = 0, coloursCorrect = 0;
        for(int i = 0; i < guess.length; i++){
            if(guess[i] == code[i]){
                pegsCorrect++;
            }
            for (int k : code) {
                if (guess[i] == k) {
                    coloursCorrect++;
                }
            }
        }
        System.out.println("You have " + pegsCorrect + " peg(s) correct and " + coloursCorrect + " color(s) correct.");
    }
}