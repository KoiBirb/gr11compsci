import hsa2.GraphicsConsole;
import java.awt.Color;
import java.lang.Math;

public class ArtWithMath {
    GraphicsConsole gc = new GraphicsConsole(500, 400);
    public static void main (String[] args) {
        new ArtWithMath();
    }

    public ArtWithMath() {
        gc.setAntiAlias(true);

        gc.fillRect(300,480,100,20);
    }
}
