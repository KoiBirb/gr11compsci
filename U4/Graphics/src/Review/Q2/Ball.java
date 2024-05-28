package Review.Q2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Ball {

    Rectangle r;
    BufferedImage ballImage;


    public Ball() {
        r = new Rectangle((int) (Math.random() * 800), 10, 50, 50);
        try {
            ballImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Asteroid_Vesta.jpeg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        r.y += 10;
    }

    public void draw() {
        Main.gc.setColor(Color.red);
        Main.gc.drawImage(ballImage, r.x, r.y, r.width, r.height);
    }
}
