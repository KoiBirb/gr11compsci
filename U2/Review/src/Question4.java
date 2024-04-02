import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//Necklace problem
public class Question4 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> necklace;
        int x,y, index = 1, steps = 0;

        // Get the starting numbers
        System.out.print("Enter the first starting number: ");
        x = scanner.nextInt();
        System.out.print("\nEnter the second starting number: ");
        y = scanner.nextInt();

        // Create the necklace
        necklace = new ArrayList<>(Arrays.asList(x,y));

        do {
            // Add the next number to the necklace
            necklace.add(index+1, (necklace.get(index-1) + necklace.get(index)) % 10);
            index++; steps++;
        } while (!Objects.equals(necklace.get(0), necklace.get(index - 1))
                || !Objects.equals(necklace.get(1), necklace.get(index)));

        // Print the necklace and the number of steps
        for (int currentNum : necklace) System.out.print(currentNum + " ");
        System.out.println("\nIt took " + steps + " steps to get back to the starting numbers");
    }
}
