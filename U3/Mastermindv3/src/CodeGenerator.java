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
}
