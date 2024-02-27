
import java.util.Scanner;
import java.lang.Math;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get input
        System.out.print("What is the diameter of the circle: ");
        double diameter = scanner.nextDouble();
        double radius = diameter/2;

        // display the radius, area, and circumference
        System.out.println("The radius is: " + radius);
        System.out.println("The area is: " + Math.PI*(radius*radius));
        System.out.println("The circumference is: " + 2*Math.PI*radius);

        scanner.close();

    }
}
