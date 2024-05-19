package BasketBall.Entitys;
import BasketBall.Main;
import hsa2.GraphicsConsole;
import java.awt.*;
import static java.lang.Math.*;

public class Ball extends SuperEntity{
    public int mouseXOffset,mouseYOffset, lastX, lastY;
    public final int radius, diameter;
    private boolean isHeld;
    Main main;

    public Ball(GraphicsConsole gc, Main main) {
        super(375, 35, 0, 0, 0, new Color(Color.decode("#ee6730").getRGB()), gc);
        radius = 25;
        diameter = radius * 2;
        lastX = 375;
        lastY = 35;
        isHeld = false;
        this.main = main;
    }

    public void update() {
        if (isHeld || checkMouseCollision()) {
            if (!gc.getMouseButton(0)){
                isHeld = false;
            } else {
                x = gc.getMouseX() - mouseXOffset;
                y = gc.getMouseY() - mouseYOffset;
                vx = (x - lastX);
                vy = (y - lastY);
            }
        }
        vx *= 0.95;
        vy *= 0.95;

        if (!checkWallCollision() && !isHeld
                && !checkNetCollision(main.net.leftNetRect)
                && !checkNetCollision(main.net.rightNetRect)) {
            vy += 1;
            x += (int) vx;
            y += (int) vy;
        }

        lastX = x;
        lastY = y;
    }

    public void draw() {
        gc.setColor(colour);
        gc.fillOval(x, y, diameter, diameter);
    }

    private boolean checkWallCollision() {
        if (x <= 0) {
            x = 1;
            vx *= -1;
            return true;
        } else if (x >= 800 - diameter) {
            x = 799 - diameter;
            vx *= -1;
            return true;
        }
        if (y <= 0) {
            y = 1;
            vy *= -1;
            return true;
        } else if (y >= 800 - diameter) {
           if (Math.abs(vy) > 4) {
               y = 799 - diameter;
               vy *= -1;
           } else {
               y = 800-diameter;
               vy = 0;
           }
            return true;
        }
        return false;
    }
    private boolean checkMouseCollision() {
        mouseXOffset = gc.getMouseX() - x;
        mouseYOffset = gc.getMouseY() - y;
        if (gc.getMouseButton(0)){
            if (Math.sqrt(pow((x+radius) - gc.getMouseX(), 2) + pow((y+radius) - gc.getMouseY(), 2)) <= radius) {
                isHeld = true;
                return true;
            }
        }
        return false;
    }

    private boolean checkNetCollision(Rectangle r) {
        boolean collision = false;

        int edgeX = x;
        int edgeY = y;

        if (x > r.x)
            edgeX = r.x;
        else if (x < r.x + r.width)
            edgeX = r.x + r.width;
        if (y > r.y)
            edgeY = r.y;
        else if (y < r.y + r.height)
            edgeY = r.y + r.height;

        if (Math.sqrt(pow((x + radius) - edgeX, 2) + pow((y + radius) - edgeY, 2)) <= radius) {
            collision = true;
            vx *= -1;
            vy *= -1;
        }
        return collision;
    }
}
