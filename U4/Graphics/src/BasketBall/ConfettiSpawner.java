/*
 * ConfettiSpawner.java
 * May 21, 2024
 * Leo Bogaert
 * Handles the generation, updating and drawing of confetti
 */
package BasketBall;

import hsa2.GraphicsConsole;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ConfettiSpawner {
    public ArrayList<Confetti> confetti;
    private final Random random = new Random();
    GraphicsConsole gc;

    public ConfettiSpawner (GraphicsConsole gc) {
        confetti = new ArrayList<>();
        this.gc = gc;
    }

    /**
     * Fills the confetti array with random confetti objects
     */
    public void generateConfetti() {
        int amountOfConfetti = random.nextInt(150, 550);
        confetti = new ArrayList<>(amountOfConfetti); // reset the array

        for (int i = 0; i < amountOfConfetti; i++){
            /*
            * x,y set to middle of the net
            * Rotation random between 0 and 360
            * x,y velocity random between -20 and 20
            * Colour random
             */
            confetti.add(new Confetti(400,450,random.nextInt(0,361),
                    random.nextDouble(-20, 20), random.nextDouble(-20, 20),
                    new Color(random.nextInt(0,256), random.nextInt(0,256),
                            random.nextInt(0,256)), gc));
        }
    }

    /**
     * Updates the confetti
     * Removes confetti that is off-screen
     */
    public void update(){
        for (int i = 0; i < confetti.size(); i++){
            Confetti c = confetti.get(i);

            if (c != null) {
                c.update();
                if (c.x < 0 || c.x > 800)
                    confetti.set(i, null);
                if (c.y > 800)
                    confetti.set(i, null);
            }
        }
    }

    /**
     * Draws the confetti
     */
    public void draw(){
        for (Confetti c : confetti){
            if (c != null)
                c.draw();
        }
    }
}
