/*
* SuperEntity
* May 21, 2024
* Leo Bogaert
* This class is the parent class for all entities in the game.
* It contains the x and y position, the rotation, the x and y velocity, the colour and the GraphicsConsole object.
 */

package BasketBall;
import hsa2.GraphicsConsole;
import java.awt.*;

public class SuperEntity {
    public int x, y, rotation;
    public double vx, vy;
    public Color colour;
    public final GraphicsConsole gc;

    /**
     * Constructor for the SuperEntity class
     * @param x integer initial x position
     * @param y integer initial y position
     * @param rotation  integer initial rotation
     * @param vx double initial x velocity
     * @param vy double initial y velocity
     * @param colour Color object of the entity
     * @param gc HSA2 GraphicsConsole object
     */
    public SuperEntity (int x, int y, int rotation, double vx, double vy, Color colour, GraphicsConsole gc){
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.vx = vx;
        this.vy = vy;
        this.colour = colour;
        this.gc = gc;
    }
}
