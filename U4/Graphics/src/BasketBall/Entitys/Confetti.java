package BasketBall.Entitys;

import hsa2.GraphicsConsole;

import java.awt.*;

public class Confetti extends SuperEntity{
    public Confetti(int x, int y, int rotation, double vx, double vy, Color colour, GraphicsConsole gc) {
        super(x, y, rotation, vx, vy, colour, gc);
    }

    public void update(){
        x += (int) vx;
        y += (int) vy;

        vx *= 0.98;
        vy *= 0.98;
        vy += 0.1;
    }

    public void draw(){
        gc.setColor(colour);
        gc.setRotation(rotation, x + 6,y + 3);
        gc.fillRect(x,y,12,6);
    }
}
