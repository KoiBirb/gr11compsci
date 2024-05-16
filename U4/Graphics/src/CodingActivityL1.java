
import hsa2.GraphicsConsole;

import java.awt.*;
import java.util.Random;

public class CodingActivityL1 {

    GraphicsConsole gc = new GraphicsConsole(300, 300);
    Random random = new Random();
    public static void main (String[] args) {
        new CodingActivityL1();
    }

    CodingActivityL1() {
        gc.clear();
        gc.setColor(Color.BLUE);
        gc.fillRect(0, 0, 20, 20);
        gc.fillRect(280, 0, 20, 20);
        gc.fillRect(280, 280, 20, 20);
        gc.fillRect(0, 280, 20, 20);
        Polygon p = new Polygon();
        p.addPoint(150, 0);
        p.addPoint(0, 150);
        p.addPoint(150, 300);
        p.addPoint(300, 150);
        gc.setColor(Color.ORANGE);
        gc.fillPolygon(p);

        gc.setColor(Color.YELLOW);
        gc.fillRect(0, 0, 150, 200);
        gc.setColor(Color.GREEN);
        gc.drawRect(0, 0, 150, 200);

        gc.setAntiAlias(true);
        for (int i = 0; i < 6; i++){
            gc.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            gc.fillOval(random.nextInt(270), random.nextInt(270), random.nextInt(50), random.nextInt(50));
        }
    }
}
