import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing){
            System.out.println("Add (1) or subtract (2)? ");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double b = scanner.nextInt();
                System.out.println("The sum is: " + add(a, b));
            } else if (choice == 2){
                System.out.println("Enter first number: ");
                double a = scanner.nextInt();
                System.out.println("Enter second number: ");
                double b = scanner.nextInt();
                System.out.println("The difference is: " + subtract(a, b));
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to keep going? (y/n)");
            scanner.nextLine();
            if (scanner.next().equals("n")){
                keepGoing = false;
            }
        }
    }
    /**
     * Simulates choosing a random playing card from a deck of 52 cards.
     * A = 1, J = 11, Q = 12, K = 13. Hearts are 1 - 13, Diamonds are 14 - 26,
     * Clubs are 27 - 39, and Spades are 40 - 52.
     * @return		Returns the integer that corresponds to the random card.
     */
    private static int drawCard() {
        return (int) (Math.random() * 52) + 1;
    }

    /**
     * Calculate a number to the power of 4
     * @param x a double to be raised to the power of 4
     * @return x raised to the power of 4
     */
    private static double powerOf4 (double x){
        return Math.pow(x, 4);
    }

    /**
     * Translate a number to its Spanish word equivalent
     * @param x an integer between 1 and 10
     * @return the Spanish word equivalent of x
     */

    private static String translate(int x){
        return switch (x) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            case 10 -> "diez";
            default -> "no lo sé";
        };
    }

    /**
     * Calculate the sum of two integers
     * @param a an integer
     * @param b an integer
     * @return the sum of a and b
     */
    private static int add(int a, int b) {
        return a + b;
    }

    /**
     * Calculate the difference of two integers
     * @param a an integer
     * @param b an integer
     * @return the difference of a and b
     */
    private static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Calculate the sum of two doubles
     * @param a a double
     * @param b a double
     * @return the sum of a and b
     */
    private static double add(double a, double b) {
        return a + b;
    }
    /**
     * Calculate the difference of two doubles
     * @param a a double
     * @param b a double
     * @return the difference of a and b
     */
    private static double subtract(double a, double b) {
        return a - b;
    }
}