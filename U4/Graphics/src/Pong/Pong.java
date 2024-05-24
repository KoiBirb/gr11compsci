package Pong;

import hsa2.GraphicsConsole;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Pong {

    static final GraphicsConsole gc = new GraphicsConsole(800, 800);
    final int SLEEPTIME = 5;
    static int p1Score = 0, p2Score = 0;
    static Paddle p1;
    static Paddle p2;

    Ball ball;

    public static void main (String[] args) {
        new Pong();
    }

    Pong() {
        setup();

        while (true) {
            update();
            draw();
            gc.sleep(SLEEPTIME);
        }
    }

    void setup(){
        gc.setLocationRelativeTo(null);
        gc.setAntiAlias(true);
        gc.setBackgroundColor(Color.BLACK);

        p1 = new Paddle(375, 50, 4, KeyEvent.VK_A, KeyEvent.VK_D, Color.BLUE);
        p2 = new Paddle(375, 750, 4, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, Color.RED);
        ball = new Ball(400, 400, 2, 2, Color.WHITE);
    }

    void update(){
        p1.update();
        p2.update();
        ball.update();
    }

    void draw(){
        synchronized (gc) {
            gc.clear();

            p1.draw();
            p2.draw();
            ball.draw();

            gc.setColor(Color.WHITE);
            gc.drawString("Player 1: " + p1Score, 10, 10);
            gc.drawString("Player 2: " + p2Score, 10, 20);
        }
    }
}
