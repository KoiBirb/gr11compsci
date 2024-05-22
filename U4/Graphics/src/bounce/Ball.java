package bounce;

import java.awt.*;

public class Ball {
    public int x, y, diameter, vx, vy, weight;
    Color colour;

    public Ball() {
        x = (int)((Math.random()*700) + 50);
        y = (int)((Math.random()*500) + 50);
        diameter = (int) ((Math.random()*60) + 10);
        vx = (int)((Math.random()*6) + 1);
        vy = (int)((Math.random()*6) + 1);
        colour = new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f));
        weight = diameter/2;
    }


    public Ball(int x, int y, int diameter, int vx) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.vx = vx;
        this.vy = vx;
    }
}
