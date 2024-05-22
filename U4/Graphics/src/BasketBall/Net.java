/*
 * Net.java
 * May 21, 2024
 * Leo Bogaert
 * Creates a Net Object that can detect ball collision and generate confetti
 */
package BasketBall;
import hsa2.GraphicsConsole;
import java.awt.*;

public class Net {
    int x,y;
    GraphicsConsole gc;
    public Rectangle centreNetRect;
    Main main;

    /**
     * Constructor for the Net class
     * @param x x position of the net
     * @param y y position of the net
     * @param gc HSA2 GraphicsConsole object
     * @param main Main class object
     */
    public Net(int x, int y, GraphicsConsole gc, Main main){
        this.x = x;
        this.y = y;
        this.gc = gc;
        this.main = main;

        centreNetRect = new Rectangle(x, y, 70,4);
    }

    /**
     * Updates the net
     * Checks for ball collision and generates confetti if the ball is in the net
     */
    public void update (){
        if (checkBallCollision()) {
            boolean spawn = true;
            for (Confetti c : main.cSpawn.confetti) {
                if (c != null) {
                    spawn = false;
                    break;
                }
            }
            if (spawn)
                main.cSpawn.generateConfetti();
        }
    }

    /**
     * Draws the net
     */
    public void draw(){
        gc.setColor(Color.ORANGE);
        gc.setStroke(4);
        gc.drawLine(x, y,x+70,y);
    }

    /**
     * Checks if the ball is in the net
     * @return true if the ball is in the net
     */
    private boolean checkBallCollision(){
        // if the ball is not moving down, return false
        if (main.b.vy < 0)
            return false;
        return main.b.x > x && main.b.x+main.b.diameter < x+70 && main.b.y < y && main.b.y+10 > y;
    }
}
