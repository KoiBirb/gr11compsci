import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static int stones, playerNumber, playerStoneCount;


    public static void main(String[] args) {
        boolean keepGoing = true, validInput;
        //initialize the stones and player number
        startGame();

        while (keepGoing){
            // Check if its player turn
            switch(playerNumber){
                case 1:
                    validInput = false;
                    // Ask for stones and ensure between 0 and max stone count
                    do {
                        System.out.print("There are " + stones + " stones. How many would you like? ");
                        playerStoneCount = scanner.nextInt();
                        if (playerStoneCount > maxStoneCount() || playerStoneCount <= 0) System.out.println("Invalid");
                        else validInput = true;
                    } while (!validInput);
                    //Draw stones and change turns
                    playerDraw(playerStoneCount);
                    playerNumber++;
                    break;
                case 2:
                    //Draw random number stones 0 < x < max stone count
                    System.out.println("There are " + stones + " stones. Your opponent takes " + compDraw() + " stones.");
                    playerNumber--;
                    break;
            }
            // Check victor
            if (stones <= 0){
                switch (playerNumber){
                    case 1:
                        System.out.println("Your opponent took the last stone - you win!");
                        break;
                    case 2:
                        System.out.println("You took the last stone - you lose!");
                }
                // Ask to keep playing
                keepGoing = keepPlaying();
            }
        }
    }

    /**
     * Chooses a random number between 1 and maxStoneCount
     * @return int value of stones taken
     */
    private static int compDraw(){
        int x = rand.nextInt(maxStoneCount()) + 1;
        stones -= x;
        return x;
    }

    /**
     * Removes stones from the pile
     * @param numStones int value less than total stones
     */
    private static void playerDraw(int numStones){
        stones -= numStones;
    }

    /**
     * Finds the max number of stones that can be taken
     * @return int value between 1-3
     */
    private static int maxStoneCount(){
        return Math.min(stones, 3);
    }

    /**
     * Asks user if they want to keep playing
     * @return boolean value true to keep playing false to quit
     */
    private static boolean keepPlaying(){
        boolean keepGoing = true;
        System.out.print("Would you like to play again? Q to quit: ");
        if (scanner.next().trim().toLowerCase().equals("q")) {
            keepGoing = false;
            System.out.println("""
                    -------------------------------------------------------------------------------------
                    Thanks for playing!""");
            }
        else startGame();
        return keepGoing;
    }

    /**
     * Sets a random value to stones 14 < x < 31 and prints rules
     */
    private static void startGame(){
        stones = rand.nextInt(16) + 15;
        playerNumber = 1;
        System.out.println("""
                Welcome to the game of Nim.
                There will be 15 - 30 stones selected for a game.
                You will take turns with your opponent drawing stones. Whoever draws the last stone loses.
                You can draw 1, 2, or 3 stones. You cannot draw more stones than there are left in the game.
                -------------------------------------------------------------------------------------""");
    }
}