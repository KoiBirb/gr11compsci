import java.util.Scanner;
import java.lang.Math;

public class Q8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a,b;

        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();

        System.out.println("The hypotenuse is: " + Math.sqrt((Math.pow(a,2.0))+(Math.pow(b,2.0))));

        scanner.close();
    }
}
