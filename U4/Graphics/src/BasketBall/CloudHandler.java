package BasketBall;

import hsa2.GraphicsConsole;
import java.util.Random;

public class CloudHandler {

    GraphicsConsole gc;
    Clouds[] clouds = new Clouds[2];
    Random random = new Random();

    public CloudHandler(GraphicsConsole gc){
        clouds[0] = (new Clouds(800, random.nextInt(25,300), 0, -1, 0, gc));
        clouds[1] = (new Clouds(1300, random.nextInt(25,300), 0, -1, 0, gc));
        this.gc = gc;
    }

    public void update(){
        for (int i = 0; i < clouds.length; i++){
            Clouds c = clouds[i];
            c.update();
            if (c.cloud.x + c.cloud.width < 0)
                clouds[i] = (new Clouds(800, random.nextInt(25, 300), 0, -1, 0, gc));
        }
    }

    public void draw(){
        for (Clouds c : clouds){
            c.draw();
        }
    }
}
