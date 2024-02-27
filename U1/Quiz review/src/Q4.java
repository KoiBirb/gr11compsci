import java.util.Scanner;
public class Q4 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("\nHours: " + minutes/60 + ":" + minutes%60);

        scanner.close();
    }
}
