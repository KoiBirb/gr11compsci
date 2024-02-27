import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int number = scanner.nextInt();
        System.out.println("The hundreds digit is: " + number/100);
        System.out.println("The tens digit is: " + (number/10)%10);
        System.out.println("The ones digit is: " + number%10);

        scanner.close();
    }
}
