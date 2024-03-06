import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A number please!: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            if (num == 0){
                System.out.println("Zero");
            } else {
                System.out.println("Positive");
            }
        } else{
            System.out.println("Negative");
        }

        System.out.println("Whats ur birth year?: ");
        int year = scanner.nextInt();

        if (year >= 2003 && year < 2009){
            System.out.println("ur high school");
        } else if (year > 2009) {
            System.out.println("old");
        } else {
            System.out.println("young");
        }

        System.out.println("3 numbers please!: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}