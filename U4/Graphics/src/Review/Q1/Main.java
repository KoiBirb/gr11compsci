package Review.Q1;

import hsa2.GraphicsConsole;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Main {

    static final GraphicsConsole gc = new GraphicsConsole(800, 800, "DVD");
    ArrayList<DVD> dvds = new ArrayList<>();

    public static void main(String[] args) {
        new Main();
    }

    Main() {
        setup();

        while (true) {
            update();
            draw();
            gc.sleep(10);
        }
    }

    void setup(){
        gc.setLocationRelativeTo(null);
        gc.setAntiAlias(true);
        gc.setBackgroundColor(Color.BLACK);
        gc.enableMouse();
        gc.clear();

        dvds.add(new DVD());
    }

    void update(){
        if (gc.getMouseButton(0)){
            dvds.add(new DVD());
        } else if (gc.getMouseButton(2)){
            if (!dvds.isEmpty())
                dvds.remove(dvds.size()-1);
        }

        if (gc.getKeyCode() == KeyEvent.VK_EQUALS){
            for (DVD dvd : dvds) {
                dvd.size += 5;
            }
        } else if (gc.getKeyCode() == KeyEvent.VK_MINUS){
            for (DVD dvd : dvds) {
                dvd.size -= 5;
            }
        }

        for (DVD dvd : dvds) {
            dvd.update();
        }
    }

    void draw(){
        synchronized (gc) {
            gc.clear();
            for (DVD dvd : dvds) {
                dvd.draw();
            }
        }
    }
}
