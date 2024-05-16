import hsa2.GraphicsConsole;
import java.awt.Color;

public class Fading {
    GraphicsConsole gc = new GraphicsConsole(800, 600, "Spots");

    public static void main(String[] args) {
        new Fading();
    }

    Fading() {
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setBackgroundColor(new Color(120,120,120,10));
        gc.clear();
        gc.setColor(Color.RED);

        int sleepTime = 5, size = 40;

        while (true) {
            gc.clear();
            int x = (int)((Math.random() * 700) + 50);
            int y = (int)((Math.random() * 500) + 50);
            gc.fillOval(x, y, size, size);
            gc.sleep(sleepTime);
            //make random colour for the next ball
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);
            gc.setColor(new Color(r,g,b));
        }

    }
}
