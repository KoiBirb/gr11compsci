package Catch;

import hsa2.GraphicsConsole;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main implements ActionListener {

    public static final GraphicsConsole gc = new GraphicsConsole(800, 800, "Catch");
    ArrayList<Ball> b = new ArrayList<>();
    Timer t = new Timer(1000, this);
    Paddle p = new Paddle();

    public static void main (String[] args) {
        new Main();
    }

    public Main() {

        setup();

        while (true) {
            update();
            draw();
            gc.sleep(5);
        }
    }

    public void setup() {
        gc.setLocationRelativeTo(null);
        gc.setAntiAlias(true);
        gc.enableMouseMotion();
        gc.setBackgroundColor(Color.WHITE);
        gc.setVisible(true);
        t.start();

        b.add(new Ball());
    }

    public void update() {
        for (int i = 0; i < b.size(); i++) {
            b.get(i).update();
            if (b.get(i).r.y > 800) {
                b.remove(i);
            }
        }
        p.update();
        checkCollision();
    }

    public void draw() {
       synchronized (gc) {
           gc.clear();
           for (int i = 0; i < b.size(); i++) {
               b.get(i).draw();
           }
           p.draw();
       }
    }

    void checkCollision() {
        for (int i = 0; i < b.size(); i++) {
            if (p.r.intersects(b.get(i).r)) {
                b.remove(i);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.add(new Ball());
    }
}
