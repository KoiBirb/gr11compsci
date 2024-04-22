import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        System.out.print("Enter a Username: ");
        String username = scanner.nextLine().toUpperCase();

        while (!validInput){
            System.out.print("Enter a password that is at least 8 characters: ");
            String password = scanner.nextLine().toLowerCase();

            if (password.length() >= 8){
                System.out.println("Username: " + username + "\nPassword: " + password);
                validInput = true;
            } else System.out.println("Password must be at least 8 characters long.");
        }

        System.out.print("Enter your first name: ");
        String first = scanner.nextLine().toUpperCase();
        System.out.print("Enter your middle initial: ");
        String middle = scanner.nextLine().toUpperCase();
        System.out.print("Enter your last name: ");
        String last = scanner.nextLine().toUpperCase();

        System.out.println("Monogram: " + first.toLowerCase().charAt(0) + " " + middle.toUpperCase() + ". " + last.toLowerCase().charAt(0));

        validInput = false;
        String word = "";
        while (!validInput){
            System.out.println("Enter a 8 character word: ");
            word = scanner.nextLine();
            if (word.length() == 8) validInput = true;
            else System.out.println("Word must be 8 characters long.");
        }

        System.out.println(word.substring(0, 3));
        System.out.println(word.substring(word.length()/2-1, word.length()/2+2));
        System.out.println(word.substring(word.length()-3));

        System.out.println("Enter a word: ");
        String vowels = scanner.nextLine().toLowerCase();

        int vowelsCount = 0;
        for (int i = 0; i < vowels.length(); i++){
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e'
                    || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'u'){
                vowelsCount++;
            }
        }
        System.out.println("The number of vowels in the word is: " + vowelsCount);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();
        int wordCount = 1;

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' ' ){
                wordCount++;
            }
        }
        System.out.println("The number of words in the sentence is: " + wordCount);
    }
}