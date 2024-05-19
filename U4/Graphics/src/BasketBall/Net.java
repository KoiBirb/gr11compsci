package BasketBall;

import BasketBall.Entitys.Confetti;
import hsa2.GraphicsConsole;

import java.awt.*;

public class Net {
    int x,y;
    GraphicsConsole gc;
    public Rectangle leftNetRect, rightNetRect, centreNetRect;
    Main main;

    public Net (int x, int y, GraphicsConsole gc, Main main){
        this.x = x;
        this.y = y;
        this.gc = gc;
        this.main = main;

        leftNetRect = new Rectangle(x,y,5,4);
        rightNetRect = new Rectangle(x + 65, y + 65, 5,4);
        centreNetRect = new Rectangle(x + 5, y + 5, 60,4);
    }

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

    public void draw(){
        gc.setColor(Color.ORANGE);
        gc.setStroke(4);
        gc.drawLine(x, y,x+70,y);
    }

    private boolean checkBallCollision(){
        if (main.b.vy < 0)
            return false;
        return main.b.x > x && main.b.x+main.b.diameter < x+70 && main.b.y < y && main.b.y+10 > y;
    }
}
