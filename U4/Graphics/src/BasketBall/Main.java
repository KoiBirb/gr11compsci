package BasketBall;

import BasketBall.Entitys.Ball;
import hsa2.GraphicsConsole;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    final int SLEEPTIME;
    long lastTime;
    public final GraphicsConsole gc;
    Ball b;
    public Net net;
    ConfettiSpawner cSpawn;

    public static void main(String[] args) {
        new Main();
    }

    Main() {
        SLEEPTIME = 10;
        lastTime = System.currentTimeMillis();
        gc = new GraphicsConsole(800, 800);

        setUp();

        while (true) {
            update();
            draw();
            gc.sleep(SLEEPTIME);
        }
    }

    public void draw(){
        synchronized (gc) {
            gc.clear();
            gc.clearRotation();
            gc.setStroke(1);
            gc.setColor(Color.darkGray);
            gc.fillRect(0, 700, 800, 100);
            gc.setColor(Color.GRAY);
            gc.fillRect(390,500, 20,250);
            gc.setColor(new Color(255,255,255, 60));
            gc.fillRect(275,325, 250,175);
            gc.setStroke(4);
            gc.setColor(Color.BLACK);
            gc.drawRect(275,325, 250,175);
            gc.drawRect(350, 405,100,75);


            b.draw();
            net.draw();
            cSpawn.draw();
        }
    }

    public void update(){
        if (gc.getKeyCode() == KeyEvent.VK_E && System.currentTimeMillis() - lastTime > 1000) {
            b = new Ball(gc, this);
        }

        b.update();
        net.update();
        cSpawn.update();
    }

    public void setUp(){
        b = new Ball(gc, this);
        net = new Net(365, 455, gc, this);
        cSpawn = new ConfettiSpawner(gc);

        gc.setBackgroundColor(Color.WHITE);
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.enableMouse();
        gc.enableMouseMotion();
        gc.setTitle("Basketball");
        gc.setBackgroundColor(Color.decode("#87ceeb"));
        gc.clear();
    }
}
