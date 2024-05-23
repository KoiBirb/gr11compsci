package Pong;

import java.awt.*;

public class Ball extends Rectangle {

    int vx,vy;
    Color colour;

    public Ball(int x, int y, int vx, int vy, Color colour){
        super(x, y, 40, 40);
        this.vx = vx;
        this.vy = vy;
        this.colour = colour;
    }

    public void update(){
        if (this.intersects(Pong.p1.bounds) || this.intersects(Pong.p2.bounds)) {
            vy *= -1;
            if (this.intersects(Pong.p1.bounds)) {
                y = Pong.p1.bounds.y + height + 1;
            } else {
                y = Pong.p2.bounds.y - height - 1;
            }
        } else {
            x += vx;
            y += vy;
        }

        if (x <= 0) {
            x = 0;
            vx *= -1;
        } else if (x >= 800 - width) {
            x = 800 - width;
            vx *= -1;
        } else if (y <= 0) {
            y = 0;
            vy *= -1;
        } else if (y >= 800 - height) {
            y = 800 - height;
            vy *= -1;
        }
    }

    public void draw(){
        Pong.gc.setColor(colour);
        Pong.gc.fillOval(x, y, width, height);
    }
}
