/*
Simple calculator program
Leo Bogaert
March 07, 2024,
Takes 1 or 2 numbers and an operator and returns the result
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Create objects and define variables
        Scanner scanner = new Scanner(System.in);

        int operation = 0;
        double x = 0,y = 0, z = 0;
        boolean keepRunning = true, validInput = false;

        while (keepRunning) {
            while (!validInput) {
                // Ensure valid input
                try {
                    // Ask for operator
                    System.out.println("""
                            WELCOME TO THE SIMPLE CALCULATOR APPLICATION
                            =============================================
                            1. Addition			    5. Exponentiation
                            2. Subtraction			6. Average
                            3. Multiplication		7. Sine
                            4. Division			    8. Cosine
                            =============================================""");
                    System.out.print("Which operation would you like to perform? ");
                    operation = scanner.nextInt();

                    // Check if the number is within bounds
                    if (operation > 8 || operation < 1) {
                       throw new InputMismatchException();
                    }

                    // Correct input
                    System.out.println("=============================================");
                    validInput = true;

                } catch (InputMismatchException e){
                    // Clear scanner and prompt user to try again
                    System.out.println("Invalid input, please try again");
                    sleep(1250);
                    scanner.next();
                }
            }

            validInput = false;
            while (!validInput){
                try {
                    // Ask for numbers
                    if (operation == 6){
                        System.out.print("Enter the first number: ");
                        x = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        y = scanner.nextDouble();
                        System.out.println("Enter the third number: ");
                        z = scanner.nextDouble();
                    } else if (operation < 7) {
                        System.out.print("Enter the first number: ");
                        x = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        y = scanner.nextDouble();
                    } else {
                        System.out.print("Enter the angle: ");
                        x = scanner.nextDouble();
                    }

                    System.out.println("=============================================");
                    validInput = true;
                } catch (InputMismatchException e){
                    // Clear scanner and prompt user to try again
                    System.out.println("Invalid input, please try again");
                    scanner.next();
                }
            }

            // Perform operation and display output
            switch (operation) {
                case 1:
                    System.out.println("The answer is: " + (x + y));
                    break;
                case 2:
                    System.out.println("The answer is: " + (x - y));
                    break;
                case 3:
                    System.out.println("The answer is: " + (x * y));
                    break;
                case 4:
                    System.out.println("The answer is: " + (x / y));
                    break;
                case 5:
                    System.out.println("The answer is: " + Math.pow(x, y));
                    break;
                case 6:
                    System.out.println("The answer is: " + (x + y + z) / 3);
                    break;
                case 7:
                    System.out.println("The answer is: " + Math.toDegrees(Math.sin(Math.toRadians(x))));
                    break;
                case 8:
                    System.out.println("The answer is: " + Math.cos(x));
                    break;
            }

            System.out.println("Would you like to perform another operation? (y/n)");
            String response = scanner.next().trim().toLowerCase();

            if (response.equals("n")) keepRunning = false;
            else validInput = false;
        }
    }
}