// Elapsed Time Calculator
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Collect inputs
       System.out.print("What is the starting hour?: ");
       int startingHour = scanner.nextInt();
        scanner.nextLine();

       System.out.print("\nAM or PM? ");
       String AMorPM = scanner.nextLine().toUpperCase();

       System.out.print("\nWhat is the elapsed time?: ");
       int elapsedTime = scanner.nextInt();

       // Calculate the final hour
       int finalHour = (startingHour + elapsedTime) % 24; // Use modulo to handle hours greater than 24

       // Check if the AM or PM is correct
       if (finalHour > 12){
           finalHour -= 12;
           AMorPM = AMorPM.equals("AM") ? "PM" : "AM"; // Switch AM to PM or vice versa
       }
       System.out.println("The time is " + finalHour + " " + AMorPM);
    }
}