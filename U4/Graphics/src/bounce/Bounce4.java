package bounce;

import hsa2.GraphicsConsole;
import java.awt.Color;
import java.util.ArrayList;

public class Bounce4 {
    int sleepTime = 5, windowWidth = 800, windowHeight = 600;
    ArrayList<Ball> balls = new ArrayList<>();
    final GraphicsConsole gc = new GraphicsConsole(windowWidth, windowHeight);

    public static void main(String[] args) {
        new Bounce4();
    }

    Bounce4() {
        setup();
        while (true) {
            update();
            draw();
            gc.sleep(sleepTime);
        }
    }

    void setup() {
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setBackgroundColor(Color.LIGHT_GRAY);
        gc.clear();

        for (int i = 0; i < 10; i++) {
            balls.add(new Ball());
        }
    }

    void update() {
       for (Ball b : balls) {
           b.x += b.vx;
           b.y += b.vy;
           if (b.x < 0 || (b.x + b.diameter) > windowWidth) {
               b.vx *= -1;
           }
           if (b.y < 0 || (b.y + b.diameter) > windowHeight) {
               b.vy *= -1;
           }
       }
    }

    void draw(){
        synchronized (gc) {
            gc.clear();
            for (Ball b : balls) {
                gc.setColor(b.colour);
                gc.fillOval(b.x, b.y, b.diameter, b.diameter);
            }
        }
    }
}
