/*
 * Ball.java
 * May 21, 2024
 * Leo Bogaert
 * Defines a ball object that can be moved with the mouse
 */

package BasketBall;
import hsa2.GraphicsConsole;
import java.awt.*;
import static java.lang.Math.*;

public class Ball extends SuperEntity {

    public int mouseXOffset,mouseYOffset, lastX, lastY;
    public final int radius, diameter;
    private boolean isHeld;
    Main main;

    /**
     * Constructor for the Ball class
     * Initializes ball to starting x, y, no rotation, no velocity, orange colour, and a radius of 25
     * @param gc HSA2 GraphicsConsole object
     * @param main Main class object
     */
    public Ball(GraphicsConsole gc, Main main) {
        super(375, 35, 0, 0, 0, new Color(Color.decode("#ee6730").getRGB()), gc);
        radius = 25;
        diameter = radius * 2;
        lastX = 375;
        lastY = 35;
        isHeld = false;
        this.main = main;
    }

    /**
     * Updates the ball
     * If the ball is held, it will follow the mouse
     * If the ball is not held, it will fall and bounce off walls
     */
    public void update() {

        if (isHeld || checkMouseCollision()) {
            // check for mouse release
            if (!gc.getMouseButton(0)){
                isHeld = false;
            } else {
                x = gc.getMouseX() - mouseXOffset;
                y = gc.getMouseY() - mouseYOffset;
                vx = (x - lastX);
                vy = (y - lastY);
            }
        }

        // drag
        vx *= 0.95;
        vy *= 0.95;

        handleWallCollision();

        if (!isHeld){
            vy += 1; // gravity

            x += (int) vx;
            y += (int) vy;
        }

        lastX = x;
        lastY = y;
    }

    /**
     * Draws the ball
     */
    public void draw() {
        gc.setColor(colour);
        gc.fillOval(x, y, diameter, diameter);
    }

    /**
     * Handles wall collisions
     * Depending on the wall the ball will be placed on the wall and the velocity will be reversed
     */
    private void handleWallCollision() {
        if (x <= 0) {
            x = 1;
            vx *= -1;
        } else if (x >= 800 - diameter) {
            x = 799 - diameter;
            vx *= -1;
        }
        if (y <= 0) {
            y = 1;
            vy *= -1;
        } else if (y >= 800 - diameter) {
           if (Math.abs(vy) > 4) {
               y = 799 - diameter;
               vy *= -1;
           } else {
               y = 800-diameter;
               vy = 0;
           }
        }
    }

    /**
     * Checks if the mouse is colliding with the ball
     * @return true if the mouse is colliding with the ball
     */
    private boolean checkMouseCollision() {

        // find location of mouse on the ball
        mouseXOffset = gc.getMouseX() - x;
        mouseYOffset = gc.getMouseY() - y;

        // check if mouse is colliding with ball
        if (gc.getMouseButton(0)){
            if (Math.sqrt(pow((x+radius) - gc.getMouseX(), 2) + pow((y+radius) - gc.getMouseY(), 2)) <= radius) {
                isHeld = true;
                return true;
            }
        }
        return false;
    }
}
