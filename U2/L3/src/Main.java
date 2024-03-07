import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What hurricane level: ");
        int level = scanner.nextInt();

        switch (level){
            case 1:
                System.out.println("74-95 mph");
                System.out.println("64 to 82 kt");
                System.out.println("119 to 153 km/h");
                break;
            case 2:
                System.out.println("96-110 mph");
                System.out.println("83 to 95 kt");
                System.out.println("154 to 177 km/h");
                break;
            case 3:
                System.out.println("111-129 mph");
                System.out.println("96 to 113 kt");
                System.out.println("178 to 209 km/h");
                break;
            case 4:
                System.out.println("130-156 mph");
                System.out.println("114 to 135 kt");
                System.out.println("210 to 249 km/h");
                break;
            case 5:
                System.out.println("157 mph or higher");
                System.out.println("Greater than 135 kt");
                System.out.println("Greater than 249 km/h");
                break;
        }
        System.out.println("Whats ur mass: ");
        double mass = scanner.nextDouble() * 9.8;

        System.out.println("What planet?");
        System.out.println("1. Vulcan 2.Cybertron 3.Krypton 4.Alderaan");
        int planet = scanner.nextInt();

        switch (planet){
            case 1:
                System.out.println("Your weight is: " + mass * 0.091);
                break;
            case 2:
                System.out.println("Your weight is: " + mass * 4.612);
                break;
            case 3:
                System.out.println("Your weight is: " + mass * 0.720);
                break;
            case 4:
                System.out.println("Your weight is: " + mass * 0.643);
                break;
        }

        System.out.println("Whats your grade: ");
        int grade = scanner.nextInt();

        int gradeLevel;
        if (grade < 50) {
            gradeLevel = 0;
        } else if (grade == 100){
            gradeLevel = 5;
        }else {
            gradeLevel = (grade - 50) / 10 + 1;
        }

        switch (gradeLevel) {
            case 0:
                System.out.println("Failure");
                break;
            case 1:
                System.out.println("Level 1");
                break;
            case 2:
                System.out.println("Level 2");
                break;
            case 3:
                System.out.println("Level 3");
                break;
            case 4:
            case 5:
                System.out.println("Level 4");
                break;

            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}