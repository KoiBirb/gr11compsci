/*
Code1Leo
Leo Bogaert
Feb 28, 2024
First Project to test basic java skills
 */

import java.util.Scanner;
import java.lang.Math;

public class Code1Leo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare variables used in the program
        int x,y,z;
        String name;
        double answer, average;

        String word = "Pizza";

        // Collect test scores
        System.out.println("Part 1");
        System.out.print("Enter your first test score: ");
        x = sc.nextInt();
        System.out.print("Enter your second test score: ");
        y = sc.nextInt();
        System.out.print("Enter your third test score: ");
        z = sc.nextInt();

        // Calculate the average of the test scores and display
        average = (x + y + z) / 3.0;
        System.out.printf("Your average test scores is %.2f", average);

        // solve math problem and display answer
        System.out.println("\n\nPart 2");
        answer = Math.sqrt(Math.pow((3.5+2.6),5)) + (22.0/7.0);
        System.out.printf("%.3f", answer);

        // Ask for name and display message
        System.out.println("\n\nPart 3");
        System.out.print("What is your full name? ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println(name + ", did you know that I love " + word + "?");

        sc.close();
    }
}