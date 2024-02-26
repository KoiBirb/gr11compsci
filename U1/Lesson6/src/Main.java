import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance traveled (in km): ");
        double distance = scanner.nextDouble();
        System.out.print("Time taken (in hours): ");
        double time = scanner.nextDouble();
        System.out.print("Average speed: " + distance / time + " km/h");


    }
}