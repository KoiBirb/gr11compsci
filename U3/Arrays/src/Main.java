import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[3] = 7;

        String[] ducks = {"Donald", "Huey", "Dewey", "Louis"};

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine();
        }
        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        int[] powers = new int[10];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(i, 2);
        }
        for (int power : powers) {
            System.out.println(power);
        }

        int[] countdown = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Countdown:");
        for(int i = 9; i >= 0; i--) {
            System.out.println(countdown[i]);
        }
        System.out.println("GO!");

        int[] randList = new int[25];

        for (int i = 0; i < randList.length; i++) {
            randList[i] = rand.nextInt(100);
        }

        for (int i : randList) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        for (int i : randList) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}