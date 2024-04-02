// Elapsed Time Calculator
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("What is the starting hour?: ");
       int startingHour = scanner.nextInt();
        scanner.nextLine();

       System.out.print("\nAM or PM? ");
       String AMorPM = scanner.nextLine().toUpperCase();

       System.out.print("\nWhat is the elapsed time?: ");
       int elapsedTime = scanner.nextInt();

       int finalHour = startingHour + elapsedTime;

       if (AMorPM.equals("AM") && finalHour > 12) {
           System.out.println("The time is " + (finalHour - 12) + " PM");
       } else if ("PM".equals(AMorPM) && finalHour > 12) {
           System.out.println("The time is " + (finalHour + - 12) + " AM");
       } else if (AMorPM.equals("AM")){
           System.out.println("The time is " + finalHour + " AM");
       } else {
           System.out.println("The time is " + finalHour + " PM");
       }
    }
}