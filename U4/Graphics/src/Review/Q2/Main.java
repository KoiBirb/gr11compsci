package Review.Q2;

import hsa2.GraphicsConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main implements ActionListener {

    static final GraphicsConsole gc = new GraphicsConsole(800, 800, "Q2");
    Timer t = new Timer(500, this);
    static ArrayList<Ball> b = new ArrayList<>();
    Paddle p = new Paddle();

    boolean keepGoing = true;

    public static void main(String[] args) {
        new Main();
    }

    Main() {
        setup();

        while (keepGoing) {
            update();
            draw();
            gc.sleep(10);
        }
        System.exit(0);
    }

    void setup() {
        gc.setLocationRelativeTo(null);
        gc.setAntiAlias(true);
        gc.setBackgroundColor(Color.black);
        gc.enableMouseMotion();
        t.start();
        gc.clear();
    }

    void update() {
        p.update();

        for(int i = 0; i < b.size(); i++) {
            b.get(i).update();
            if (b.get(i).r.y > 800) {
                b.remove(i);
                i--;
            }
        }

        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).r.intersects(p.r)) {
                keepGoing = false;
            }
        }
    }

    void draw() {
        synchronized (gc) {
            gc.clear();

            gc.setColor(Color.white);
            p.draw();

            for (int i = 0; i < b.size(); i++) {
                b.get(i).draw();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.add(new Ball());
    }
}
