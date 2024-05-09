package Main;

import Balls.*;
import hsa2.GraphicsConsole;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel implements Runnable {
    public GraphicsConsole gc = new GraphicsConsole(600, 800);
    private Thread thread;
    public static ArrayList<SuperBall> balls = new ArrayList<>();

    private final int FPS = 60;

    public GamePanel() {
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setTitle("Ball Drop");
        gc.setBackgroundColor(Color.decode("#eab676"));
        gc.clear();
    }

    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void update() {
        for (SuperBall ball : balls) {
            ball.update();
        }
    }

    public void draw() {
        for (SuperBall ball : balls) {
            ball.draw(gc);
        }
    }

    @Override
    public void run() {
        // Delta method FPS clock
        double drawInterval = 1000000000.0/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (thread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                draw();
                delta--;
                drawCount++;
            }
            if(timer>= 1000000000) {
                System.out.println("FPS:" + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }
}
