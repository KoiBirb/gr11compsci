import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?: ");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cant vote");
        }

        System.out.println("Whats your name?: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.equals("Leo")) System.out.println("wow, we have the same name!");
        System.out.println("come to our super cool club pls");

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}