/*
Input reading practice
Leo Bogaert
Feb 21, 2024
Takes input from a user and stores the data
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's practice collecting input and displaying it as output.");
        System.out.println("You can write your answers to the practice problems below this line of code.\n");

        System.out.println("Whats your name?: ");
        String name = scanner.nextLine();
        System.out.println("Whats your age?: ");
        int age = scanner.nextInt();
        System.out.println("Are you ready to solve this problem? \n Solve 1+1: ");
        int mathAnswer = scanner.nextInt();

        System.out.println("Alright here's what you've said so far: \n Your name is: " + name + "\n You are " + age + " years old\n And your answer to the problem was: " + mathAnswer);

        scanner.close();
    }
}