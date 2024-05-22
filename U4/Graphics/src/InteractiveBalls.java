import bounce.Ball;
import hsa2.GraphicsConsole;
import java.awt.Color;
import java.util.ArrayList;

public class InteractiveBalls{
    int sleepTime = 5, windowWidth = 800, windowHeight = 600;
    ArrayList<Ball> balls = new ArrayList<>();
    final GraphicsConsole gc = new GraphicsConsole(windowWidth, windowHeight);

    public static void main(String[] args) {
        new InteractiveBalls();
    }

    InteractiveBalls() {
        setup();
        while (!gc.isKeyDown('Q')) {
            update();
            draw();
            gc.sleep(sleepTime);
        }
        gc.dispose();
    }

    void setup() {
        gc.setAntiAlias(true);
        gc.enableMouseMotion();
        gc.setLocationRelativeTo(null);
        gc.setBackgroundColor(Color.WHITE);
        gc.clear();

        for (int i = 0; i < 2; i++) {
            balls.add(new Ball());
        }
    }

    void update() {
        for (int i = 0; i < 2; i++){
            if (i == 0){
                balls.get(i).x = gc.getMouseX();
                balls.get(i).y = gc.getMouseY();
            }
            else {
                if (gc.isKeyDown('W')){
                    balls.get(i).y -= 3;
                } else if (gc.isKeyDown('S')){
                    balls.get(i).y += 3;
                } else if (gc.isKeyDown('A')){
                    balls.get(i).x -= 3;
                } else if (gc.isKeyDown('D')){
                    balls.get(i).x += 3;
                }
            }
        }
    }

    void draw(){
        synchronized (gc) {
            gc.clear();
            for (int i = 0; i < 2; i++){
                if (i == 0){
                    gc.setColor(Color.BLUE);
                    gc.fillOval(balls.get(i).x, balls.get(i).y, balls.get(i).diameter, balls.get(i).diameter);
                } else {
                    gc.setColor(Color.RED);
                    gc.fillOval(balls.get(i).x, balls.get(i).y, balls.get(i).diameter, balls.get(i).diameter);
                }
            }
        }
    }
}
