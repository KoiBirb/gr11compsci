public class Main {
    public static void main(String[] args) {
        Coin nickel = new Coin();
        nickel.flipCoin();
        if (nickel.showFace() == 0) System.out.println("Heads up!");
        else System.out.println("Tails up!");

        Rectangle r = new Rectangle(5, 10);
        Rectangle s = new Rectangle();
        s.setLength(20);
        s.setWidth(30);

        System.out.println("Rectangle r has length " + r.getLength() + " and width " + r.getWidth());
        System.out.println("Rectangle s has area " + s.getArea() + " and perimeter " + s.getPerimeter());

        Adder a = new Adder();
        a.getInput();
    }
}