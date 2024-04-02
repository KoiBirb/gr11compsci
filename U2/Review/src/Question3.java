import java.util.Scanner;

//Calculator
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y;
        int operation;
        boolean keepGoing = true, invalidOperation = false;

        while (keepGoing){
            // User inputs
            System.out.println("What operation would you like to perform? 1.Addition 2.Multiplication 3.Exponent");
            operation = scanner.nextInt();

            System.out.println("Enter the first number: ");
            x = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            y = scanner.nextDouble();

            // Perform the operation
            switch (operation){
                case 1:
                    System.out.println("The sum is: " + (x + y));
                    break;
                case 2:
                    System.out.println("The product is: " + (x * y));
                    break;
                case 3:
                    System.out.println("The result is: " + Math.pow(x, y));
                    break;
                default:
                    System.out.println("Invalid operation");
                    invalidOperation = true;
            }
            // Check if the operation was invalid
            if (invalidOperation){
               break;
            }

            // Ask if the user wants to perform another operation
            System.out.println("Would you like to perform another operation? 1.Yes 2.No");
            operation = scanner.nextInt();
            if (operation == 2) {
                keepGoing = false;
            }
        }
    }
}
