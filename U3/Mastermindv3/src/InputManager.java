import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    private static final Scanner scanner = new Scanner(System.in);
    private boolean validInput;
    private int pegCount, colourCount;
    private String guess;

    public InputManager() {
        validInput = false;
        pegCount = 0;
        colourCount = 0;
        guess = "";
    }

    public void askStartingValues() {
        validInput = false;
        System.out.print("Enter the number of pegs (2-8): ");
        while (!validInput) {
            try {
                pegCount = scanner.nextInt();
            } catch (InputMismatchException e) {
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
            } catch (InputMismatchException e) {
                scanner.next();
            }
            if (colourCount >= pegCount && colourCount <= 10) validInput = true;
            else System.out.print("Invalid input. Please enter a number between " + pegCount + " and 10: ");
        }
        scanner.nextLine();
    }

    public void askGuess() {
        validInput = false;
        while (!validInput) {
            try {
                guess = scanner.nextLine();
            } catch (InputMismatchException e){
                scanner.next();
            }
            if (checkValid(guess, colourCount, pegCount)) validInput = true;
            else System.out.print("Invalid input. Please enter a valid guess: ");
        }
    }

    /**
     * Checks if the user's guess is valid
     * @param guess String of user's guess
     * @param colourCount int count of the number of colours
     * @return boolean true if guess is valid
     */
    private boolean checkValid (String guess, int colourCount, int pegCount) {
        char[] charGuess = guess.toCharArray();
        if (guess.length() != pegCount) return false;
        for (char c : charGuess)
            if (Character.getNumericValue(c) > colourCount) return false;
        return true;
    }

    public int getPegCount() {
        return pegCount;
    }

    public int getColourCount() {
        return colourCount;
    }

    public String getGuess() {
        return guess;
    }
}
