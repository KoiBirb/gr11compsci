package Pong;

import java.awt.*;

public class Paddle{

    public int vx;
    private final int UPKEY, DOWNKEY;
    public Rectangle bounds;
    Color colour;

    public Paddle(int x, int y, int vx, int UPKEY, int DOWNKEY, Color colour){
        this.vx = vx;
        this.UPKEY = UPKEY;
        this.DOWNKEY = DOWNKEY;
        this.colour = colour;
        bounds = new Rectangle(x, y, 75, 15);
    }

    public void update(){
        if (bounds.x < 0)
            bounds.x = 0;
        else if (bounds.x > 800 - bounds.width)
            bounds.x = 800 - bounds.width;
        else {
            if (Pong.gc.isKeyDown(UPKEY))
                bounds.x -= vx;
            if (Pong.gc.isKeyDown(DOWNKEY))
                bounds.x += vx;
        }
    }

    public void draw(){
        Pong.gc.setColor(colour);
        Pong.gc.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
}
