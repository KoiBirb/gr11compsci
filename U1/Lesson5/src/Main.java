/*
Simple calculator
Leo Bogaert
Feb 22, 2024
 */

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double x, y, l, w, d;
    public static void main(String[] args) {
//        System.out.println(6*7);
//        System.out.println(12 + 4 * 6);
//        System.out.println(83/9 + " " + 83 % 9);
//        System.out.println(83.0/9.0);

        boolean correctInput = false;
        boolean keepGoing = true;
        int calculatorMode = 0;
        String continueCalculator;

        Scanner scanner = new Scanner(System.in);

        // choose the calculators mode
        while (keepGoing) {
            System.out.println("Please choose the calculators mode\n 1: Sum 2: Difference 3: Product 4: Quotient 5: Sphere Volume 6: Rectangle volume 7: Volume of Square");
            System.out.print("Mode: ");

            while (!correctInput) {
                try {
                    calculatorMode = scanner.nextInt();

                    if (calculatorMode < 1 || calculatorMode > 7) System.out.println("That is not a option please try again");
                    else correctInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("That is not a option please try again");
                    scanner.next();
                }

            }

            // get number input from user and display answer depending on calculator mode
            correctInput = false;
            while (!correctInput) {
                try {
                    if (calculatorMode == 1) {
                        defaultInput(scanner,"Type the numbers you want to add");
                        System.out.println("The sum is: " + (x + y));
                    } else if (calculatorMode == 2) {
                        defaultInput(scanner,"Type the numbers you want to subtract");
                        System.out.println("The difference is: " + (x - y));
                    } else if (calculatorMode == 3) {
                        defaultInput(scanner, "Type the numbers you want to multiply");
                        System.out.println("The product is: " + (x * y));
                    } else if (calculatorMode == 4) {
                        defaultInput(scanner, "Type the numbers you want to divide");
                        System.out.println("The quotient is: " + (x / y) + "And the remainder is: " + (x % y));
                    } else if (calculatorMode == 5) {
                        System.out.println("Type the Length and Width");
                        System.out.print("L: ");
                        l = scanner.nextInt();
                        System.out.print("W: ");
                        w = scanner.nextInt();
                        System.out.println("The Volume is: " + (l * w));
                    } else if (calculatorMode == 6) {
                        System.out.println("Type the Diameter");
                        System.out.print("D: ");
                        d = scanner.nextInt();
                        System.out.println("The volume is: " + ((Math.PI * Math.pow(d, 3)) / 6));
                    } else {
                        System.out.println("Type the Side length: ");
                        System.out.print("S: ");
                        l = scanner.nextInt();
                        System.out.println("The volume is: " + Math.pow(l, 3));
                    }
                    correctInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("That is not a number");
                    scanner.next();
                }
            }


            // ask user to continue
            boolean continueCorrectInput = false;
            while (!continueCorrectInput) {

                System.out.println("Would you like to continue?");
                System.out.print("Y or N: ");
                continueCalculator = (scanner.next().trim()).toLowerCase();

                if (continueCalculator.equals("n")) {
                    keepGoing = false;
                    continueCorrectInput = true;
                } else if (continueCalculator.equals("y")) {
                    correctInput = false;
                    calculatorMode = 0;
                    continueCorrectInput = true;
                } else {
                    System.out.println("Not an option.");
                    scanner.next();
                }
            }
        }
    }
    //Asks the user for 2 decimal inputs
    private static void defaultInput(Scanner scanner, String message){
        System.out.println(message);
        System.out.print("X: ");
        x = scanner.nextInt();
        System.out.print("Y: ");
        y = scanner.nextInt();
    }
}