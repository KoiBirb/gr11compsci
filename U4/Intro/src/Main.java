package Intro.src;
import java.awt.Color;
import hsa2.GraphicsConsole;
/*
 * FirstDrawing.java
 * by Mr. Campbell
 * October 31, 2022
 * Program to demonstrate how to use HSA2 for drawing.
 */

public class Main {
    GraphicsConsole gc = new GraphicsConsole(800,300);
    public static void main(String[] args) {
            new Main();

        }

    Main() {
        gc.setBackgroundColor(Color.YELLOW);
        gc.clear();

        gc.setColor(Color.BLUE);
        gc.drawRect(400, 150, 50, 50);
    }
}