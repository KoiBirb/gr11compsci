/*
 * #1 Alpha Wolf
 * July 31,2024
 * Please dont read the codeeeee
 */
import java.awt.Color;
import java.awt.Polygon;
import hsa2.GraphicsConsole;
import java.awt.Rectangle;

public class forBro1 {

    public static void main(String[] args) {
        new forBro1();
    }

    //global variables + colours
    int avatars=60, width=800, height=800;
    GraphicsConsole gc = new GraphicsConsole(width,height);
    Rectangle maze = new Rectangle(70, 70, width-140, height-140);
    Rectangle koi = new Rectangle(600,655,avatars,avatars);
    Rectangle alpha = new Rectangle(maze.x+80,maze.y-25,avatars+5,avatars+5);

    final static int MOVE = 2; //number of pixels that the paddle will move with each key press

    Color koiFace = new Color (225, 193, 178); //avatars
    Color koiHair = new Color (136, 77, 49);

    Color alphaFace = new Color (218, 171, 145);
    Color alphaHair = new Color (76, 43, 32);

    Color mediumBlue = new Color (100, 149, 237); //background
    Color pastelBlue = new Color (167, 199, 231);
    Color darkestBlue = new Color (25, 25, 112);

    Color pink = new Color(251, 198, 207);
    Color blush = new Color (254,127,156);

    //game loop
    forBro1(){

        setup(); //call setup
        while (true) {
            moveKoi();
            drawGraphics();
            heart();
            gc.sleep(10);
        }
    }

    //setup
    void setup() {
        gc.setTitle("Happy 6 Months! (the code is bad dont look)");
        gc.setAntiAlias(true);
        gc.setLocationRelativeTo(null);
        gc.setColor(Color.RED.darker());
    }

    //move koi
    void moveKoi(){
        if (gc.isKeyDown(37)) {	//isKeyDown uses keyCodes. Left arrow
            if (koi.x > maze.x) {
                koi.x -= MOVE;
            }
        }
        if (gc.isKeyDown(39) && koi.x < width-140 ) koi.x += MOVE;
        if (gc.isKeyDown(38) && koi.y > maze.y) koi.y -= MOVE;
        if (gc.isKeyDown(40) && koi.y < height-140) koi.y += MOVE;
        if((gc.isKeyDown(38)&&gc.isKeyDown(39))||(gc.isKeyDown(38)&&gc.isKeyDown(37))||(gc.isKeyDown(40)&&gc.isKeyDown(39))||(gc.isKeyDown(40)&&gc.isKeyDown(37))){
            gc.showDialog("Why'd you try to cheat :(", "GAME OVER");
        }
    }

    //graphics background + avatars
    void drawGraphics() {
        synchronized(gc) {
            gc.setBackgroundColor(pastelBlue);
            gc.clear();
            gc.setAntiAlias(true);

            //background
            gc.setColor(mediumBlue);
            gc.fillStar(0,0, 900, 800);

            //clouds
            gc.setColor(Color.WHITE);
            gc.fillOval(700,15,75,75); //cloud1
            gc.fillOval(670,60,50,50);
            gc.fillOval(710,60,50,50);
            gc.fillOval(745,60,50,50);

            gc.fillOval(200,500,75,75); //cloud2
            gc.fillOval(170,545,50,50);
            gc.fillOval(210,545,50,50);
            gc.fillOval(245,545,50,50);

            gc.fillOval(50,300,75,75); //cloud3
            gc.fillOval(20,345,50,50);
            gc.fillOval(60,345,50,50);
            gc.fillOval(95,345,50,50);

            gc.fillOval(700,700,75,75); //cloud1
            gc.fillOval(670,745,50,50);
            gc.fillOval(710,745,50,50);
            gc.fillOval(745,745,50,50);

            gc.fillOval(25,15,75,75); //cloud1
            gc.fillOval(-5,60,50,50);
            gc.fillOval(35,60,50,50);
            gc.fillOval(75,60,50,50);

            gc.fillOval(100,700,110,75); //cloud4 fat
            gc.fillOval(70,745,50,50);
            gc.fillOval(110,745,50,50);
            gc.fillOval(150,745,50,50);
            gc.fillOval(190,745,50,50);

            gc.fillOval(500,400,110,75); //cloud5 fat
            gc.fillOval(470,445,50,50);
            gc.fillOval(510,445,50,50);
            gc.fillOval(550,445,50,50);
            gc.fillOval(590,445,50,50);

            gc.fillOval(400,200,110,75); //cloud6 fat
            gc.fillOval(370,245,50,50);
            gc.fillOval(410,245,50,50);
            gc.fillOval(450,245,50,50);
            gc.fillOval(490,245,50,50);

            //maze
            gc.setColor(darkestBlue);
            gc.setStroke(5);
            gc.drawRect(maze.x, maze.y, width-140, height-140);

            //horizontal
            gc.drawLine (maze.x+75+75, maze.y+avatars+10, maze.x+75+75+75+75+75, maze.y+avatars+10); //1 horiz
            gc.drawLine (maze.x+75+75+75+75+75+75, maze.y+avatars+10, maze.x+75+75+75+75+75+75+75+75, maze.y+avatars+10);

            gc.drawLine (maze.x+75, maze.y+avatars+10+75, maze.x+75+75+75+75, maze.y+avatars+10+75); //2 horiz
            gc.drawLine (maze.x+75+75+75+75+75, maze.y+avatars+10+75, maze.x+75+75+75+75+75+75, maze.y+avatars+10+75);
            gc.drawLine (maze.x+75+75+75+75+75+75+75, maze.y+avatars+10+75, maze.x+75+75+75+75+75+75+75+75+60, maze.y+avatars+10+75);

            gc.drawLine (maze.x, maze.y+avatars+10+75+75, maze.x+75, maze.y+avatars+10+75+75); //3 horiz
            gc.drawLine (maze.x+75+75, maze.y+avatars+10+75+75, maze.x+75+75+75+75, maze.y+avatars+10+75+75);
            gc.drawLine (maze.x+75+75+75+75+75+75, maze.y+avatars+10+75+75, maze.x+75+75+75+75+75+75+75, maze.y+avatars+10+75+75);
            gc.drawLine (maze.x+75+75+75+75+75+75+75+75, maze.y+avatars+10+75+75, maze.x+75+75+75+75+75+75+75+75+60, maze.y+avatars+10+75+75);

            gc.drawLine (maze.x+75, maze.y+avatars+10+75+75+75, maze.x+75+75, maze.y+avatars+10+75+75+75); //4 horiz
            gc.drawLine (maze.x+75+75+75, maze.y+avatars+10+75+75+75, maze.x+75+75+75+75+75+75, maze.y+avatars+10+75+75+75);
            gc.drawLine (maze.x+75+75+75+75+75+75+75, maze.y+avatars+10+75+75+75, maze.x+75+75+75+75+75+75+75+75, maze.y+avatars+10+75+75+75);

            gc.drawLine (maze.x, maze.y+avatars+10+75+75+75+75, maze.x+75, maze.y+avatars+10+75+75+75+75); //5 horiz
            gc.drawLine (maze.x+75+75, maze.y+avatars+10+75+75+75+75, maze.x+75+75+75, maze.y+avatars+10+75+75+75+75);
            gc.drawLine (maze.x+75+75+75+75+75+75+75+75, maze.y+avatars+10+75+75+75+75, maze.x+75+75+75+75+75+75+75+75+60, maze.y+avatars+10+75+75+75+75);

            gc.drawLine (maze.x+75, maze.y+avatars+10+75+75+75+75+75, maze.x+75+75, maze.y+avatars+10+75+75+75+75+75); //6 horiz
            gc.drawLine (maze.x+75+75+75+75, maze.y+avatars+10+75+75+75+75+75, maze.x+75+75+75+75+75+75+75, maze.y+avatars+10+75+75+75+75+75);

            gc.drawLine (maze.x+75+75+75, maze.y+avatars+10+75+75+75+75+75+75, maze.x+75+75+75+75, maze.y+avatars+10+75+75+75+75+75+75); //7 horiz
            gc.drawLine (maze.x+75+75+75+75+75, maze.y+avatars+10+75+75+75+75+75+75, maze.x+75+75+75+75+75+75+75, maze.y+avatars+10+75+75+75+75+75+75);

            gc.drawLine (maze.x+75+75+75, maze.y+avatars+10+75+75+75+75+75+75+75, maze.x+75+75+75+75+75, maze.y+avatars+10+75+75+75+75+75+75+75); //8 horiz

            //vert
            gc.drawLine (maze.x+avatars+15, maze.y, maze.x+avatars+15, maze.y+75); //1 vert
            gc.drawLine (maze.x+avatars+15, maze.y+75+75+75+70, maze.x+avatars+15, maze.y+75+75+75+75+70);
            gc.drawLine (maze.x+avatars+15, maze.y+75+75+75+70+75+75, maze.x+avatars+15, maze.y+75+75+75+75+70+75+75+75);

            gc.drawLine (maze.x+avatars+15+75, maze.y, maze.x+avatars+15+75, maze.y+70); //2 vert
            gc.drawLine (maze.x+avatars+15+75, maze.y+75+75+70, maze.x+avatars+15+75, maze.y+75+75+75+70);
            gc.drawLine (maze.x+avatars+15+75, maze.y+75+75+75+75+75+70, maze.x+avatars+15+75, maze.y+75+75+75+75+75+75+75+75+60);

            gc.drawLine (maze.x+avatars+15+75+75, maze.y+75+75+75+70, maze.x+avatars+15+75+75,maze.y+75+75+75+75+75+75+70 ); //3 vert

            gc.drawLine (maze.x+avatars+15+75+75+75, maze.y+75+70, maze.x+avatars+15+75+75+75, maze.y+75+75+70); //4 vert
            gc.drawLine (maze.x+avatars+15+75+75+75, maze.y+75+75+75+75+75, maze.x+avatars+15+75+75+75, maze.y+75+75+75+75+75+70);

            gc.drawLine (maze.x+avatars+15+75+75+75+75, maze.y+75+70, maze.x+avatars+15+75+75+75+75, maze.y+75+75+70); //5 vert
            gc.drawLine (maze.x+avatars+15+75+75+75+75, maze.y+75+75+75+70, maze.x+avatars+15+75+75+75+75, maze.y+75+75+75+75+70);
            gc.drawLine (maze.x+avatars+15+75+75+75+75, maze.y+75+75+75+75+75+75+70, maze.x+avatars+15+75+75+75+75, maze.y+75+75+75+75+75+75+75+70);

            gc.drawLine (maze.x+avatars+15+75+75+75+75+75, maze.y+70, maze.x+avatars+15+75+75+75+75+75, maze.y+75+70); //6 vert
            gc.drawLine (maze.x+avatars+15+75+75+75+75+75, maze.y+70+75+75, maze.x+avatars+15+75+75+75+75+75, maze.y+75+70+75+75+75+75);
            gc.drawLine (maze.x+avatars+15+75+75+75+75+75, maze.y+70+75+75+75+75+75+75, maze.x+avatars+15+75+75+75+75+75, maze.y+75+70+75+75+75+75+75+75+65);

            gc.drawLine (maze.x+avatars+15+75+75+75+75+75+75, maze.y, maze.x+avatars+15+75+75+75+75+75+75, maze.y+70); //7 vert
            gc.drawLine (maze.x+avatars+15+75+75+75+75+75+75, maze.y+70+75, maze.x+avatars+15+75+75+75+75+75+75, maze.y+70+75+75+75+75);
            gc.drawLine (maze.x+avatars+15+75+75+75+75+75+75, maze.y+70+75+75+75+75+75+75+75, maze.x+avatars+15+75+75+75+75+75+75, maze.y+70+75+75+75+75+75+75+75+65);

            gc.drawLine (maze.x+avatars+15+75+75+75+75+75+75+75, maze.y+75+75+75+75+70, maze.x+avatars+15+75+75+75+75+75+75+75, maze.y+75+75+75+75+75+75+75+70); //8 vert

            gc.setColor(pastelBlue);
            gc.fillRect(598, 665, 75, 100);
            gc.fillRect(maze.x+80,maze.y-25,avatars+5,avatars+5);

            //koi
            gc.setColor(koiFace);
            gc.fillOval(koi.x, koi.y, avatars, avatars);

            gc.setColor(koiHair);
            gc.fillArc(koi.x-3,koi.y,avatars+3,50,-30,245);

            gc.setColor(Color.WHITE);
            gc.fillOval(koi.x+12, koi.y+30, 17, 17);
            gc.fillOval(koi.x+32, koi.y+30, 17, 17);

            gc.setColor(Color.BLACK);
            gc.fillOval(koi.x+12, koi.y+30, 10, 10);
            gc.fillOval(koi.x+32, koi.y+30, 10, 10);
            gc.setStroke(3);
            gc.drawLine(koi.x+25, koi.y+50, koi.x+30, koi.y+50);

            gc.setColor(blush);
            gc.fillOval(koi.x+10, koi.y+47, 10, 5);
            gc.fillOval(koi.x+40, koi.y+47, 10, 5);

            //Alpha
            gc.setColor(alphaHair);
            gc.fillRect(alpha.x, alpha.y+20, avatars, 60);

            gc.setColor(alphaFace);
            gc.fillOval(alpha.x, alpha.y,avatars, avatars);

            gc.setColor(alphaHair);
            gc.fillArc(alpha.x-3,alpha.y,avatars+3,50,-30,245);

            gc.setColor(Color.WHITE);
            gc.fillOval(alpha.x+12, alpha.y+30, 17, 17);
            gc.fillOval(alpha.x+32, alpha.y+30, 17, 17);

            gc.setColor(Color.BLACK);
            gc.fillOval(alpha.x+18, alpha.y+35, 10, 10);
            gc.fillOval(alpha.x+40, alpha.y+35, 10, 10);
            gc.drawLine(alpha.x+25, alpha.y+50, alpha.x+30, alpha.y+50);

            gc.setColor(blush);
            gc.fillOval(alpha.x+10, alpha.y+47, 10, 5);
            gc.fillOval(alpha.x+40, alpha.y+47, 10, 5);
        }
    }

    //when koi meets alpha
    void heart() {
        if(alpha.contains(koi.x,koi.y)) {
            gc.setTitle("YIPPEE! I love youuu");

            synchronized(gc) {
                gc.setColor(darkestBlue);
                gc.fillRect(0,0,width,height);

                gc.setColor(blush);
                gc.fillOval(alpha.x-30, alpha.y-30, 100, 100);
                gc.fillOval(alpha.x+60, alpha.y-30, 100, 100);

                Polygon heart2 = new Polygon();
                heart2.addPoint(alpha.x-20, alpha.y+50);
                heart2.addPoint(alpha.x+150, alpha.y+50);
                heart2.addPoint(alpha.x+70, alpha.y+130);//tip
                gc.fillPolygon(heart2);

                gc.setColor(pink);
                gc.fillOval(alpha.x-10, alpha.y-10, 80, 80);
                gc.fillOval(alpha.x+65, alpha.y-10, 80, 80);

                Polygon heart = new Polygon();
                heart.addPoint(alpha.x-5, alpha.y+50);
                heart.addPoint(alpha.x+70, alpha.y+30);
                heart.addPoint(alpha.x+140, alpha.y+50);
                heart.addPoint(alpha.x+70, alpha.y+120);//tip
                gc.fillPolygon(heart);
            }
        }
    }
}
