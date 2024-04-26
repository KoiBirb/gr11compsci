
public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        CodeGenerator codeGenerator;
        boolean keepGoing = true;
        int round = 0;

        // Get number of pegs and colours then initialize code
        inputManager.askStartingValues();
        codeGenerator = new CodeGenerator(inputManager.getPegCount(), inputManager.getColourCount());

        // Game loop
        while (keepGoing) {
            // Increment round and get user input
            round++;
            System.out.print("Guess #" + round + ": ");
            // Get guess and check if user has won
            inputManager.askGuess();
            if (codeGenerator.checkWin(inputManager.getGuess(), codeGenerator.getCode())) keepGoing = false;
            else codeGenerator.getClues(inputManager.getGuess(), codeGenerator.getCode());
        }

        System.out.println("You guessed the code in " + round + " turns.");
        System.out.println("Thanks for playing!\n");
    }
}