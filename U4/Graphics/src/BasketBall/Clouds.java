package BasketBall;

import hsa2.GraphicsConsole;
import java.awt.*;
import java.util.Random;

public class Clouds extends SuperEntity{

    Random random = new Random();
    Rectangle cloud;

    /**
     * Constructor for the Clouds class
     * @param x integer initial x position
     * @param y integer initial y position
     * @param rotation  integer initial rotation
     * @param vx double initial x velocity
     * @param vy double initial y velocity
     * @param gc HSA2 GraphicsConsole object
     */
    public Clouds(int x, int y, int rotation, double vx, double vy, GraphicsConsole gc) {
        super(x, y, rotation, vx, vy, Color.WHITE, gc);
        this.cloud = generateCloud();
    }

    /**
     * Updates the cloud
     */
    public void update(){
      cloud.x += (int) vx;
    }

    /**
     * Draws the cloud
     */
    public void draw(){
        gc.setColor(colour);
        gc.fillRect(cloud.x, cloud.y, cloud.width, cloud.height);
    }

    /**
     * Generates a cloud random rectangle
     * @return Java.awt.Rectangle object
     */
    private Rectangle generateCloud() {
        int width = random.nextInt(100, 400);
        return new Rectangle(x, y, width, random.nextInt(100, width+1));
    }
}
