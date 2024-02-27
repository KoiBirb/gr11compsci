import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();

        System.out.println("Angle A is: " + Math.toDegrees(Math.asin(a/c)));
        System.out.println("Angle B is: " + Math.toDegrees(Math.asin(b/c)));

        scanner.close();
    }
}
