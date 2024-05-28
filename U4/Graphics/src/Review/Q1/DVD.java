package Review.Q1;

import java.awt.*;

public class DVD {

    int x,y,vx,vy,size = 50;

    public DVD(){
        x = (int) (Math.random()*700 + 100);
        y = (int) (Math.random()*700 + 100);
        vx = (int) (Math.random()*15 + 1);
        vy = (int) (Math.random()*15 + 1);

    }

    public void update(){

        if (x < 0){
            x = 0;
            vx *= -1;
        } else if (x > 800-size*3){
            x = 800-size*3;
            vx *= -1;
        }

        if (y < size){
            y = size;
            vy *= -1;
        } else if (y > 800){
            y = 800;
            vy *= -1;
        }

        x += vx;
        y += vy;
    }

    public void draw(){
        Main.gc.setColor(Color.red);
        Main.gc.setFont(new Font("Arial", Font.BOLD, size));
        Main.gc.drawString("DVD", x, y);
    }
}
