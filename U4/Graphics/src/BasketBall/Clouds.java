package BasketBall;

import hsa2.GraphicsConsole;
import java.awt.*;
import java.util.Random;

public class Clouds extends SuperEntity{

    Random random = new Random();
    Rectangle cloud;

    public Clouds(int x, int y, int rotation, double vx, double vy, GraphicsConsole gc) {
        super(x, y, rotation, vx, vy, Color.WHITE, gc);
        this.cloud = generateCloud();
    }

    public void update(){
      cloud.x += (int) vx;
    }

    public void draw(){
        gc.setColor(colour);
        gc.fillRect(cloud.x, cloud.y, cloud.width, cloud.height);
    }

    private Rectangle generateCloud() {
        int width = random.nextInt(100, 400);
        int height = random.nextInt(100, width);
        return new Rectangle(x, y, width, height);
    }
}
