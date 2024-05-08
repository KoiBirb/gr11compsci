package Balls;

import hsa2.GraphicsConsole;
import java.awt.image.BufferedImage;

public class SuperBall {
    public BufferedImage image;
    public int x, y, width, height;

    public SuperBall( int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void update() {

    }

    public void draw(GraphicsConsole gc) {
        gc.drawImage(image, x, y, width, height);
    }
}
