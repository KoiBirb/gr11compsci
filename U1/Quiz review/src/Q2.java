import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What symbol would you like to use?");
        String symbol = scanner.next();

        System.out.println(symbol);
        System.out.println(symbol+symbol+symbol);
        System.out.println(symbol+symbol+symbol+symbol+symbol);
        System.out.println(symbol+symbol+symbol+symbol+symbol+symbol+symbol);

        scanner.close();
    }
}