/*
 * Confetti.java
 * May 21, 2024
 * Leo Bogaert
 * Defines a confetti object
 */
package BasketBall;

import hsa2.GraphicsConsole;
import java.awt.*;

public class Confetti extends SuperEntity {
    public Confetti(int x, int y, int rotation, double vx, double vy, Color colour, GraphicsConsole gc) {
        super(x, y, rotation, vx, vy, colour, gc);
    }

    /**
     * Updates the confetti
     */
    public void update(){
        x += (int) vx;
        y += (int) vy;

        // drag & gravity
        vx *= 0.98;
        vy *= 0.98;
        vy += 0.1;
    }

    /**
     * Draws the confetti
     */
    public void draw(){
        gc.setColor(colour);
        gc.setRotation(rotation, x + 6,y + 3); // rotates from center of confetti
        gc.fillRect(x,y,12,6);
    }
}
