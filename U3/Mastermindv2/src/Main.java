import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        boolean keepGoing = true, validInput = false;
        int round = 0, pegCount = 0, colourCount = 0;
        char[] code;
        String guess = "";

        // Get number of pegs and colours then initialize code
        System.out.print("Enter the number of pegs (2-8): ");
        while (!validInput) {
            try {
                pegCount = scanner.nextInt();
            } catch (InputMismatchException e){
                scanner.next();
            }
            if (pegCount >= 2 && pegCount <= 8) validInput = true;
            else System.out.print("Invalid input. Please enter a number between 2 and 8: ");
        }

        System.out.print("Enter the number of colors (" + pegCount + "-10): ");
        validInput = false;
        while (!validInput) {
            try {
                colourCount = scanner.nextInt();
            } catch (InputMismatchException e){
                scanner.next();
            }
            if (colourCount >= pegCount && colourCount <= 10) validInput = true;
            else System.out.print("Invalid input. Please enter a number between " + pegCount + " and 10: ");
        }

        code = getCode(pegCount, colourCount);
        scanner.nextLine();

        // Game loop
        while (keepGoing){
            // Increment round and get user input
            round++;
            validInput = false;
            System.out.print("Guess #" + round + ": ");
            while (!validInput) {
                try {
                    guess = scanner.nextLine();
                } catch (InputMismatchException e){
                    scanner.next();
                }
                if (checkValid(guess, colourCount, pegCount)) validInput = true;
                else System.out.print("Invalid input. Please enter a valid guess: ");
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
    public static char[] getCode(int pegCount, int colourCount) {
        char[] code = new char[pegCount];
        char[] colours = new char[colourCount];
        for (int i = 0; i < colourCount; i++) {
            colours[i] = Integer.toString(i).charAt(0);
        }

        for (int i = 0; i < pegCount; i++) {
            int randNum = rand.nextInt(colourCount);
            while (colours[randNum] == 'x') {
                randNum = rand.nextInt(colourCount);
            }
            code[i] = colours[randNum];
            colours[randNum] = 'x';
        }
        return code;
    }

    /**
     * Checks if the user has won the game
     * @param guess int[] user's guess
     * @param code int[] code to guess
     * @return boolean true if user has won
     */
    public static boolean checkWin(String guess, char[] code){
        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) != code[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * Prints the number of pegs and colours correct in users guess
     * @param guess String of user's guess
     * @param code int[] code to guess
     */
    public static void getClues(String guess, char[] code){
        int pegsCorrect = 0, coloursCorrect = 0;
        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) == code[i]) pegsCorrect++;
            for (int k : code)
                if (guess.charAt(i) == k) coloursCorrect++;
        }
        System.out.println("You have " + pegsCorrect + " peg(s) correct and " + coloursCorrect + " color(s) correct.");
    }

    /**
     * Checks if the user's guess is valid
     * @param guess String of user's guess
     * @param colourCount int count of the number of colours
     * @return boolean true if guess is valid
     */
    public static boolean checkValid (String guess, int colourCount, int pegCount) {
        char[] charGuess = guess.toCharArray();
        if (guess.length() != pegCount) return false;
        for (char c : charGuess)
            if (Character.getNumericValue(c) > colourCount) return false;
        return true;
    }
}