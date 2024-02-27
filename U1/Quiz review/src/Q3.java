public class Q3 {
    public static void main(String[] args) {

        double laborCost = 0.75, rentCost = 1.00, materialCost = 0.05;

        System.out.println("Small Pizza cost: " + (laborCost + rentCost+ (materialCost * 8 * 8)));
        System.out.println("Medium Pizza cost: " + (laborCost + rentCost+ (materialCost * 12 * 12)));
        System.out.println("Large Pizza cost: " + (laborCost + rentCost+ (materialCost * 16 * 16)));
        System.out.println("X-Large Pizza cost: " + (laborCost + rentCost+ (materialCost * 20 * 20)));
    }
}