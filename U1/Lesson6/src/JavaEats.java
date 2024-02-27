import java.util.Scanner;

public class JavaEats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int burgers, falafels, salads, pizzas,drinks = 0;



        System.out.println("""
                Welcome to Java Eats!
                =======================
                Let’s get your order together for you. 
                Please indicate how many of each food item you would like to order. 
                If you do not want an item, please enter 0.
                                
                Options:
                =======================""");
        System.out.print("Cheeseburger and Fries: ");
        burgers = scanner.nextInt();
        System.out.print("Falafel and Rice Plate: ");
        falafels = scanner.nextInt();
        System.out.print("Greek Salad Supreme: ");
        salads = scanner.nextInt();
        System.out.print("Personal Pizza: ");
        pizzas = scanner.nextInt();
        System.out.print("Drinks: ");
        drinks = scanner.nextInt();
        System.out.println("=======================");
        System.out.print("With tax and delivery, your order total is $");
        System.out.printf("%.2f", (burgers * 8.99 + falafels * 9.99 + salads * 8.49 + pizzas * 7.99 + drinks * 2.49) * 1.13 + 5.00);


    }
}
