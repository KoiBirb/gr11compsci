package Review.Q2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Paddle {

    Rectangle r;
    BufferedImage paddleImage;

    public Paddle() {
        r = new Rectangle(400, 700, 100, 20);
        try {
            paddleImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/spaceship.png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        r.x = Main.gc.getMouseX();
    }

    public void draw() {
        Main.gc.drawRect(r.x, r.y, r.width, r.height);
        Main.gc.drawImage(paddleImage, r.x, r.y, r.width, r.height);
    }
}
