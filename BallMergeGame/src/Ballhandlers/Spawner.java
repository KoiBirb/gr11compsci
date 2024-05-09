package Ballhandlers;

import Balls.Cherry;
import Main.GamePanel;
import hsa2.GraphicsConsole;
import java.util.Random;

public class Spawner {
    private final Random random = new Random();
    private boolean isDropped;

    public Spawner(GraphicsConsole gc) {
        this.gc = gc;
    }

    public void update() {
        if (canSpawn())
            spawnBall();

    }

    public void draw() {

    }

    public boolean canSpawn() {

        return false;
    }

    public void spawnBall() {
        int randNum = random.nextInt(8) + 1;
        switch (randNum) {
            case 1:
                GamePanel.balls.add(new Cherry(0, 0));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }
}
