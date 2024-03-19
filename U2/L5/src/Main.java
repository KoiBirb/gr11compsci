import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            System.out.println(i);
        }

        System.out.println("What number would you like to use?");
        int x = scanner.nextInt();
        int cumulativeSum = 0;

        for (int i = 1; i <= x; i++){
            System.out.println(i);
            cumulativeSum += i;
        }
        System.out.println("The sum of all numbers from 1 to " + x + " is " + cumulativeSum);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(n + "!" + " = " + factorial);

        System.out.println("Enter a number: ");
        int y = scanner.nextInt();
        boolean isPrime = true;
        int p = 1;

        for (int i = 1; i <= y; i++){
            if (y % i == 0 && i != 1 && i != y){
                System.out.println("not prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("prime");

        isPrime = true;
        while (isPrime && p <= y) {
            if (y % p == 0 && p != 1 && p != y){
                System.out.println("not prime");
                isPrime = false;
            }
            p++;
        }
        if (isPrime) System.out.println("prime");

        scanner.close();
    }
}