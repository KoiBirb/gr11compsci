package Main;

import Ballhandlers.Spawner;
import Balls.*;
import hsa2.GraphicsConsole;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel {

    // initialize classes
    public GraphicsConsole gc = new GraphicsConsole(600, 800);
    private Spawner spawner = new Spawner(gc);
    public static ArrayList<SuperBall> balls = new ArrayList<>();
    private final int SLEEPTIME = 5;

    // set default settings
    public GamePanel() {
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.enableMouseMotion();
        gc.enableMouse();
        gc.setTitle("Ball Drop");
        gc.setBackgroundColor(Color.decode("#eab676"));
        gc.clear();
    }

    /**
     * Starts the game
     */
    public void start() {
        update();
        draw();
        gc.sleep(SLEEPTIME);
    }

    /**
     * Updates the game
     */
    private void update() {
        spawner.update();
        for (SuperBall ball : balls) {
            ball.update();
        }
    }

    /**
     * Draws the game
     */
    private void draw() {
        spawner.draw();
        for (SuperBall ball : balls) {
            ball.draw(gc);
        }
    }
}
