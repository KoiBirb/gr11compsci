package Ballhandlers;

import Balls.*;
import Main.GamePanel;
import hsa2.GraphicsConsole;
import java.util.Random;

public class Spawner {
    private final Random random = new Random();
    private final GraphicsConsole gc;

    public Spawner(GraphicsConsole gc) {
        this.gc = gc;
    }

    public void update() {
        if (!GamePanel.balls.get(GamePanel.balls.size() - 1).isDropped){
            spawnBall();
        }
    }

    public void draw() {

    }

    public void spawnBall() {
        int randNum = random.nextInt(5) + 1;
        switch (randNum) {
            case 1:
                GamePanel.balls.add(new Cherry(gc.getMouseX(), 50));
                break;
            case 2:
                GamePanel.balls.add(new Strawberry(gc.getMouseX(), 50));
                break;
            case 3:
                GamePanel.balls.add(new Grape(gc.getMouseX(), 50));
                break;
            case 4:
                GamePanel.balls.add(new Lemon(gc.getMouseX(), 50));
                break;
            case 5:
                GamePanel.balls.add(new Orange(0, 0));
                break;
        }
    }
}
