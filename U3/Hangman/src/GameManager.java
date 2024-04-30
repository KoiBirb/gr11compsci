import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);
    private ArrayList<String> incorrectLetter= new ArrayList<>();
    private int state = 1;
    private String[] guessedLetters;

    public GameManager(String word){
        guessedLetters = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            guessedLetters[i] = "_";
        }
    }

    public void printIncorrectLetters(){
        System.out.print("Incorrect letters: ");
        if (!incorrectLetter.isEmpty()){
            for (String letter : incorrectLetter){
                System.out.print(letter + " ");
            }
            System.out.println();
        } else {
            System.out.println("No incorrect letters yet.");
        }
    }

    public void drawState (int state){
        switch (state){
            case 1:
                System.out.println("""
                        +--+
                        |  |
                           |
                           |
                           |
                           |
                       =====""");
                break;
            case 2:
                System.out.println("""
                        +--+
                        |  |
                        O  |
                           |
                           |
                           |
                       =====""");
                break;
            case 3:
                System.out.println("""
                        +--+
                        |  |
                        O  |
                        |  |
                           |
                           |
                       =====""");
                break;
            case 4:
                System.out.println("""
                        +--+
                        |  |
                        O  |
                       /|  |
                           |
                           |
                       =====""");
                break;
            case 5:
                System.out.println("""
                        +--+
                        |  |
                        O  |
                       /|\\ |
                           |
                           |
                       =====""");
                break;
            case 6:
                System.out.println("""
                        +--+
                        |  |
                        O  |
                       /|\\ |
                       /   |
                           |
                       =====""");
                break;
            case 7:
                System.out.println("""
                        +--+
                        |  |
                        O  |
                       /|\\ |
                       / \\ |
                           |
                       =====""");
                break;
        }
    }

    public void askGuess(String word) {
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a letter: ");
            String letter = scanner.nextLine().toLowerCase();
            if (letter.length() == 1) {
                if (word.contains(letter)) {
                    printGuessedWords(word, letter);
                } else  {
                    incorrectLetter.add(letter);
                    state++;
                }
                validInput = true;
            } else {
                System.out.println("Please enter a single letter.");
            }
        }
    }

    private void printGuessedWords (String word, String guess){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == guess.charAt(0)){
                guessedLetters[i] = guess;
            }
        }
        for (String letter : guessedLetters){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public boolean checkWin() {
        for (String letter : guessedLetters){
            if (letter.equals("_")){
                return false;
            }
        }
        return true;
    }

    public int getState(){
        return state;
    }
}
