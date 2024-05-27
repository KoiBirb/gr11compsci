package Catch;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Ball {
    BufferedImage ballImage;
    Rectangle r;
    int vy;

    public Ball() {
        r = new Rectangle();
        r.x = (int) (Math.random() * 800);
        r.y = 10;
        vy = 10;

        try {
            ballImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/poop.jpg")));
        } catch (Exception e){
            e.printStackTrace();
        }

        r.width = 50;
        r.height = 50;
    }

    public void update() {
        r.y += vy;
    }

    public void draw() {
        Main.gc.drawRect(r.x, r.y, r.width, r.height);
        Main.gc.drawImage(ballImage, r.x, r.y, r.width, r.height);

    }
}
