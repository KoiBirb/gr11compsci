/*
 * Main.java
 * May 21, 2024
 * Leo Bogaert
 * Creates an interactive java basketball game
 * Move the basketball with the mouse and press E to reset the ball
 */
package BasketBall;
import hsa2.GraphicsConsole;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    final int SLEEPTIME = 10;
    long lastTime;

    // initialize classes
    final GraphicsConsole gc;
    Ball b;
    Net net;
    ConfettiSpawner cSpawn;

    public static void main(String[] args) {
        new Main();
    }

    Main() {

        // set current time
        lastTime = System.currentTimeMillis();
        gc = new GraphicsConsole(800, 800, "Basketball");
        setUp();

        // main loop
        while (true) {
            update();
            draw();
            gc.sleep(SLEEPTIME);
        }
    }

    /**
     * Main draw method
     */
    public void draw(){
        synchronized (gc) {
            gc.clear();
            gc.clearRotation();

            // Ground
            gc.setStroke(1);
            gc.setColor(Color.darkGray);
            gc.fillRect(0, 700, 800, 100);

            // Net pole
            gc.setColor(Color.GRAY);
            gc.fillRect(390,500, 20,250);
            gc.setColor(new Color(255,255,255, 60));
            gc.fillRect(275,325, 250,175);

            // Net Back
            gc.setStroke(4);
            gc.setColor(Color.BLACK);
            gc.drawRect(275,325, 250,175);
            gc.drawRect(350, 405,100,75);

            b.draw(); // Ball
            net.draw(); // Net
            cSpawn.draw(); // Confetti
        }
    }

    /**
     * Main update method
     */
    public void update(){

        // Reset ball on E key press
        if (gc.getKeyCode() == KeyEvent.VK_E && System.currentTimeMillis() - lastTime > 1000)
            b = new Ball(gc, this);

        b.update();
        net.update();
        cSpawn.update();
    }

    /**
     * Set up the game
     */
    public void setUp(){
        b = new Ball(gc, this);
        net = new Net(365, 455, gc, this);
        cSpawn = new ConfettiSpawner(gc);

        gc.setBackgroundColor(Color.WHITE);
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.enableMouse();
        gc.enableMouseMotion();
        gc.setBackgroundColor(Color.decode("#87ceeb")); // sky blue
        gc.clear();
    }
}
