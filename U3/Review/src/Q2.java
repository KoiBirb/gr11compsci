
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z"));
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter a message to encrypt/decrypt (or QUIT): ");
            String message = scanner.nextLine(), finalMessage = "", tempMessage = "";

            if (message.equalsIgnoreCase("QUIT")) {
                keepGoing = false;
                break;
            } else {
                for (int i = 0; i < message.length(); i++) {
                    tempMessage = message.substring(i, i + 1);
                    if (tempMessage.equals(" ")) {
                        finalMessage += " ";
                    } else if (tempMessage.equals(".")){
                        finalMessage += ".";
                    } else {
                        finalMessage += alphabet.get((alphabet.indexOf(tempMessage) + 13) % 26);
                    }
                }
                System.out.println("The translated message is: " + finalMessage);
            }
        }
    }
}