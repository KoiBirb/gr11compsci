import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = {
                {1,3,5,7,9},
                {2,4,6,8,10}
        };

        int[][] matrix2 = new int[2][5];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix3 = new int[2][5];

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                if (j == 0) matrix3[i][j] = rand.nextInt(100)*2;
                else matrix3[i][j] = rand.nextInt(100)*2+1;
            }
        }

        char[][] ticktacktoe = {
                {'X', 'O', 'O'},
                {'X', 'X', 'X'},
                {'-', '-', 'O'}
        };

        for (int i = 0; i < ticktacktoe.length; i++) {
            for (int j = 0; j < ticktacktoe[i].length; j++) {
                System.out.print(ticktacktoe[i][j] + " ");
            }
            System.out.println();
        }

        String[] names = {"Alice", "Bob", "Charlie"},
                streets = {"Main Rd", "Wall Blvd", "Broad St"},
                postalCodes = {"A1A 1A1", "B2B 2B2", "C3C 3C3"};

        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " lives on " + streets[i] + " and their postal code is " + postalCodes[i]);

        String[] names2 = {"Fortnite Battlepass", "Amoung Us", "Mine Craft"};
        int[] grades = new int[3];

        int x = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int y = 0; y < 3; y++) {
                x += scanner.nextInt();
            }
            grades[i] = x/3;
        }

        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i] + " has an average rating of " + grades[i]);
        }

    }
}