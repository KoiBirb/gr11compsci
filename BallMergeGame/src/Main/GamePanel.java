package Main;

import Ballhandlers.Spawner;
import Balls.*;
import hsa2.GraphicsConsole;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel implements Runnable {

    // initialize classes
    public GraphicsConsole gc = new GraphicsConsole(600, 800);
    private Thread thread;
    private Spawner spawner = new Spawner(gc);
    public static ArrayList<SuperBall> balls = new ArrayList<>();

    private final int FPS = 60;

    // set default settings
    public GamePanel() {
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setTitle("Ball Drop");
        gc.setBackgroundColor(Color.decode("#eab676"));
        gc.clear();
    }

    /**
     * Creates a thread that run the game
     */
    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    /**
     * Updates the game
     */
    public void update() {
        spawner.update();
        for (SuperBall ball : balls) {
            ball.update();
        }
    }

    /**
     * Draws the game
     */
    public void draw() {
        spawner.draw();
        for (SuperBall ball : balls) {
            ball.draw(gc);
        }
    }

    /**
     * Runs the game
     */
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
