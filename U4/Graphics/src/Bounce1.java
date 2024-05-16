import hsa2.GraphicsConsole;
import java.awt.Color;

public class Bounce1 {
    GraphicsConsole gc = new GraphicsConsole(800, 600);
    int x = 100,y = 100, diameter = 40, xSpeed = 2, ySpeed = 2, sleepTime = 5;
    public static void main(String[] args) {
       new Bounce1();
    }

    Bounce1() {
       setup();
         while (true) {
            checkCollision();
            moveAndDraw();
            gc.sleep(sleepTime);
         }
    }

    void setup() {
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setColor(Color.RED.darker());
    }

    void moveAndDraw() {
        gc.clear();
        x += xSpeed;
        y += ySpeed;
        gc.fillOval(x, y, diameter, diameter);
    }

    void checkCollision() {
        if (x < 0 || x > gc.getWidth() - diameter) {
            gc.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            xSpeed *= -1;
        }
        if (y < 0 || y > gc.getHeight() - diameter) {
            gc.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            ySpeed *= -1;
        }
    }
}
