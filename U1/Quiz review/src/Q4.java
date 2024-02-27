import java.util.Scanner;
public class Q4 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many minutes: ");
        int minutes = scanner.nextInt();
        System.out.printf("\nHours: " + minutes/60 + ":%02d", minutes%60);

        scanner.close();
    }
}
