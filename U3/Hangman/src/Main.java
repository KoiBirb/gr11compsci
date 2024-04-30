
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dictionary dictionary = new Dictionary();
        boolean keepPlaying = true;
        String word = dictionary.getWord();
        GameManager gm = new GameManager(word);

        System.out.println(word);

        while (keepPlaying) {
            if (gm.getState() == 7) {
                keepPlaying = false;
                System.out.println("You lost! The word was: " + word);
                System.out.println("Thanks for playing!");
            }

            sleep(1000);
            gm.drawState(gm.getState());
            gm.printIncorrectLetters();
            gm.askGuess(word);

            if (gm.checkWin()){
                keepPlaying = false;
                System.out.println("You won! The word was: " + word);
                System.out.println("Thanks for playing!");
            }
        }
    }
}