import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        // Q1
        Random random = new Random();

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        String[] symbols = {"", "", "", "", "", "", "", "", "", "", "", ""};


        for (int i = 0; i < 100; i++) {
            switch (random.nextInt(12) + 1) {
                case 1:
                    symbols[0] += "#";
                    break;
                case 2:
                    symbols[1] += "#";
                    break;
                case 3:
                    symbols[2] += "#";
                    break;
                case 4:
                    symbols[3] += "#";
                    break;
                case 5:
                    symbols[4] += "#";
                    break;
                case 6:
                    symbols[5] += "#";
                    break;
                case 7:
                    symbols[6] += "#";
                    break;
                case 8:
                    symbols[7] += "#";
                    break;
                case 9:
                    symbols[8] += "#";
                    break;
                case 10:
                    symbols[9] += "#";
                    break;
                case 11:
                    symbols[10] += "#";
                    break;
                case 12:
                    symbols[11] += "#";
                    break;
            }
        }

        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i] + "\t" + symbols[i]);
    }
}