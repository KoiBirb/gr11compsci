import hsa2.GraphicsConsole;
import java.awt.Color;
import java.lang.Math;

public class ArtWithMath {
    GraphicsConsole gc = new GraphicsConsole(1000, 1000);
    public static void main (String[] args) {
        new ArtWithMath();
    }

    public ArtWithMath() {
        gc.setAntiAlias(true);
        int scale = 500;
        int offset = 400;
        for(int i = 1; i <= 10000; i++){
            gc.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
            int radius = (int) (1.0 / 200 + 1.0 / 10 * Math.pow(Math.sin(54 * Math.PI * i / 10000), 6)*scale);
            System.out.println(radius);
            gc.drawOval((int) ((Math.cos(14 * Math.PI * i / 10000) * (1 - (3.0 / 4.0) * Math.pow(Math.cos(20 * Math.PI * i / 10000), 2))*scale) + radius) + offset,
                    (int) (((Math.sin((14*Math.PI*i)/10000) * (1-(3.0/4.0)* Math.pow(Math.cos(24 * Math.PI * i / 10000), 2)))*scale) + radius) + offset,
                        radius*2,
                        radius*2);
        }
    }
}
