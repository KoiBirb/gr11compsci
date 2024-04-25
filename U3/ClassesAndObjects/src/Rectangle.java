public class Rectangle {
    private double length, width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
