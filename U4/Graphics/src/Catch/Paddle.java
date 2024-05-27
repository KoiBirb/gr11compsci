package Catch;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Paddle {

    Rectangle r = new Rectangle(400, 700, 100, 20);
    BufferedImage paddleImage;

    public Paddle() {
        try {
            paddleImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/skib.jpg")));
        } catch (Exception e){
            e.printStackTrace();
        }
        r.x = 400;
        r.y = 700;
        r.height = 40;
        r.width = 100;
    }

    public void update() {
        r.x = Main.gc.getMouseX();
    }

    public void draw() {
        Main.gc.drawImage(paddleImage, r.x, r.y, r.width, r.height);
    }

}
