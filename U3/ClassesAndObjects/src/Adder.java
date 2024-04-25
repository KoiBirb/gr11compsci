import java.util.Random;
import java.util.Scanner;

public class Adder {
    private final Random rand = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private int x,y, guesses, answer, points;
    private String equation;

    public Adder() {
        guesses = 0;
        points = 0;
        generateEquation();
    }
    public void getInput() {
        System.out.print(equation);
        answer = scanner.nextInt();
        guesses++;
        checkCorrect();
    }

    private void checkCorrect() {
        if (answer != 999) {
            if (answer == getSum()) {
                System.out.println("Correct! It took you " + guesses + " guesses.");
                points += awardPoints();
                System.out.println("You have " + points + " points.");
                generateEquation();
                getInput();
            } else if (guesses < 3) {
                System.out.println("Incorrect. Try again.");
                getInput();
            } else {
                System.out.println("Incorrect. The answer was " + getSum());
                guesses = 0;
                generateEquation();
                getInput();
            }
        } else System.out.println("You earned " + points + " points.");
    }

    private int getSum() {
        return x + y;
    }

    private void generateEquation() {
        x = rand.nextInt(100);
        y = rand.nextInt(100);
        equation = x + " + " + y + " = ";
    }

    private int awardPoints() {
        return switch (guesses) {
            case 1 -> 5;
            case 2 -> 3;
            case 3 -> 1;
            default -> 0;
        };
    }
}
