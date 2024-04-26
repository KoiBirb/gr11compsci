import java.util.Random;

public class CodeGenerator {
    private static final Random rand = new Random();
    private final char[] code;

    public CodeGenerator(int pegCount, int colourCount) {
        code = createCode(pegCount, colourCount);
    }

    /**
     * Generates a random un-repeating code for the user to guess
     * @param pegCount int number of pegs
     * @param colourCount int number of colours
     */
    public char[] createCode(int pegCount, int colourCount) {
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

    public char[] getCode() {
        return code;
    }

    /**
     * Prints the number of pegs and colours correct in users guess
     * @param guess String of user's guess
     * @param code int[] code to guess
     */
    public void getClues(String guess, char[] code){
        int pegsCorrect = 0, coloursCorrect = 0;
        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) == code[i]) pegsCorrect++;
            for (int k : code)
                if (guess.charAt(i) == k) coloursCorrect++;
        }
        System.out.println("You have " + pegsCorrect + " peg(s) correct and " + coloursCorrect + " color(s) correct.");
    }

    /**
     * Checks if the user has won the game
     * @param guess int[] user's guess
     * @param code int[] code to guess
     * @return boolean true if user has won
     */
    public boolean checkWin(String guess, char[] code){
        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) != code[i]){
                return false;
            }
        }
        return true;
    }
}
