import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        char[] atoI = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        char[] stoJ = {'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'};
        char[] ttoZ = {'t', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char c : atoI) {
            if (lastName.toLowerCase().startsWith(String.valueOf(c))) {
                System.out.println(firstName + " " + lastName + " is in the first group.");
                break;
            }
        }
        for (char c : stoJ) {
            if (lastName.toLowerCase().startsWith(String.valueOf(c))) {
                System.out.println(firstName + " " + lastName + " is in the second group.");
                break;
            }
        }
        for (char c : ttoZ) {
            if (lastName.toLowerCase().startsWith(String.valueOf(c))) {
                System.out.println(firstName + " " + lastName + " is in the third group.");
                break;
            }
        }

        System.out.println("Enter your first name: ");
        String firstName2 = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName2 = scanner.nextLine();

        System.out.println("Your monogram is: " + firstName2.charAt(0) + middleName.charAt(0) + lastName2.charAt(0));

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Enter the password: ");
            if (password.equals(scanner.nextLine())) {
                System.out.println("You have successfully logged in.");
                break;
            } else {
                attempts++;
            }
        }
        if (attempts == 3) {
            System.out.println("You have been locked out.");
        }

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        char[] x = word.toLowerCase().toCharArray();
        int vowels = 0;

        for (char c : x) if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;

        System.out.print("Enter a sentence");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("The number of words in the sentence is: " + words.length);
    }
}