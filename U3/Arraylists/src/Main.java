
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(100));
        }

        int sum = 0;
        int largestNumber = 0;
        int smallestNumber = 100;
        for (Integer randomNumber : randomNumbers) {
            System.out.println(randomNumber);
            sum += randomNumber;
            if (randomNumber > largestNumber) {
                largestNumber = randomNumber;
            }
            if (randomNumber < smallestNumber) {
                smallestNumber = randomNumber;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest number: " + largestNumber);
        randomNumbers.remove((Integer) largestNumber);

        boolean keepGoing = true;
        ArrayList<Integer> testScores = new ArrayList<>();
        while (keepGoing){
            System.out.println("Enter a test score: ");
            int testScore = scanner.nextInt();
            if (testScore == 999){
                keepGoing = false;
            } else {
                if (testScores.isEmpty()) {
                    testScores.add(testScore);
                } else {
                    int index = 0;
                    for (int i = 0; i < testScores.size(); i++) {
                        if (testScore > testScores.get(i)) {
                            index = i + 1;
                        }
                    }
                    testScores.add(index, testScore);
                }
            }
        }
        sum = 0;
        for (int x : testScores){
            System.out.print(x + " ");
            sum += x;
        }
        System.out.println("Test averages: " + sum/(testScores.size()-1));

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        keepGoing = true;
        ArrayList<String> names = new ArrayList<>();
        while (keepGoing){
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();
            if (name.equals("QUIT")){
                keepGoing = false;
            } else {
                int index = 0;
                if (names.isEmpty()) {
                    names.add(name);
                } else {
                    for (int i = 0; i < names.size(); i++) {
                        if (String.valueOf(name.charAt(0)).compareToIgnoreCase(alphabet) < String.valueOf(names.get(i).charAt(0)).compareToIgnoreCase(alphabet)) {
                            index = i + 1;
                        }
                    }
                    names.add(index, name);
                }
            }
        }
        for (String x : names){
            System.out.print(x + " ");
        }


    }
}