/*
 * GraphicsBasics.java
 * Leo Bogaert
 * 2024/05/15
 * Creates a graphic of Gojo from Jujutsu Kaisen.
 */
import hsa2.GraphicsConsole;
import java.awt.*;

public class GraphicsBasics {
    GraphicsConsole gc = new GraphicsConsole(542, 399);
    public static void main(String[] args) {
        new GraphicsBasics();
    }

    public GraphicsBasics(){
        gc.setTitle("Gojo");
        gc.setLocationRelativeTo(null);
        gc.setAntiAlias(true);
        gc.setBackgroundColor(new Color(135,206, 235));
        gc.clear();

        Color gojoSkin = new Color(249,211,163);

        // Draw Collar
        Polygon rightCollar = new Polygon();
        rightCollar.addPoint(356, 349);
        rightCollar.addPoint(350, 370);
        rightCollar.addPoint(317,369);
        rightCollar.addPoint(307, 399);
        rightCollar.addPoint(382, 399);
        rightCollar.addPoint(388, 366);

        gc.setColor(Color.decode("#181A59"));
        gc.fillPolygon(rightCollar);
        // Shading for Collar
        Polygon rightCollarShade = new Polygon();
        rightCollarShade.addPoint(382, 399);
        rightCollarShade.addPoint(388, 366);
        rightCollarShade.addPoint(383, 367);
        rightCollarShade.addPoint(378, 399);
        gc.setColor(new Color(52,155,255, 95));  // TRANSPARENCY
        gc.fillPolygon(rightCollarShade);

        // Outline
        gc.setColor(Color.black);
        gc.drawPolygon(rightCollar);

        // left collar full
        gc.drawLine(350,370,377,370);
        Polygon leftCollar = new Polygon();
        leftCollar.addPoint(188, 313);
        leftCollar.addPoint(173, 314);
        leftCollar.addPoint(162,349);
        leftCollar.addPoint(128, 352);
        leftCollar.addPoint(129, 352);
        leftCollar.addPoint(80, 324);
        leftCollar.addPoint(40, 311);
        leftCollar.addPoint(0, 312);
        leftCollar.addPoint(0, 399);
        leftCollar.addPoint(293, 399);
        leftCollar.addPoint(291, 366);
        leftCollar.addPoint(188, 319);

        gc.fillPolygon(leftCollar);

        // behind neck hair

        Polygon bottomHairLeft = new Polygon();
        bottomHairLeft.addPoint(181, 215);
        bottomHairLeft.addPoint(181, 253);
        bottomHairLeft.addPoint(175, 270);
        bottomHairLeft.addPoint(187, 247);
        bottomHairLeft.addPoint(186, 286);
        bottomHairLeft.addPoint(196, 271);
        bottomHairLeft.addPoint(195, 215);

        Polygon bottomHairRight = new Polygon();
        bottomHairRight.addPoint(409, 207);
        bottomHairRight.addPoint(404, 229);
        bottomHairRight.addPoint(404, 251);
        bottomHairRight.addPoint(399, 235);
        bottomHairRight.addPoint(398, 220);
        bottomHairRight.addPoint(379, 284);
        bottomHairRight.addPoint(375, 266);
        bottomHairRight.addPoint(370, 205);

        gc.setColor(Color.decode("#EEEDFF"));
        gc.fillPolygon(bottomHairLeft);
        gc.fillPolygon(bottomHairRight);

        // Neck outline
        Polygon neck = new Polygon();

        neck.addPoint(196, 247);
        neck.addPoint(187, 318);
        neck.addPoint(291, 366);
        neck.addPoint(291, 366);
        neck.addPoint(291, 399);
        neck.addPoint(306, 399);
        neck.addPoint(317, 369);
        neck.addPoint(350, 369);
        neck.addPoint(355, 348);
        neck.addPoint(383, 237);
        neck.addPoint(383, 237);
        neck.addPoint(396, 212);
        neck.addPoint(390, 206);
        neck.addPoint(380, 237);
        neck.addPoint(302, 306);
        neck.addPoint(297, 310);
        neck.addPoint(267, 310);
        neck.addPoint(197, 246);
        gc.setColor(gojoSkin);
        gc.fillPolygon(neck);
        gc.setColor(Color.black);
        gc.drawPolygon(neck);

        // neck lines
        gc.drawLine(210,304,212,330);
        gc.drawLine(266,319,269,324);
        gc.drawLine(269,324,270,340);
        gc.drawLine(358,267,320,297);
        gc.drawLine(352,320,334,370);

        // Head
        Polygon headColour = new Polygon();

        headColour.addPoint(390, 206); // jaw
        headColour.addPoint(380, 237);
        headColour.addPoint(302, 306);
        headColour.addPoint(297, 310);
        headColour.addPoint(267, 310);
        headColour.addPoint(190, 240);
        headColour.addPoint(183, 214);
        headColour.addPoint(177, 214);
        headColour.addPoint(172, 203); // left ear
        headColour.addPoint(158, 180);
        headColour.addPoint(157, 132);
        headColour.addPoint(173, 184);
        headColour.addPoint(171, 116); // Forehead
        headColour.addPoint(193, 57);
        headColour.addPoint(194, 105);
        headColour.addPoint(195, 93);
        headColour.addPoint(220, 41);
        headColour.addPoint(242, 18);
        headColour.addPoint(266, 25);
        headColour.addPoint(273, 21);
        headColour.addPoint(259, 77);
        headColour.addPoint(261, 79);
        headColour.addPoint(248, 102);
        headColour.addPoint(322, 10);
        headColour.addPoint(322, 47);
        headColour.addPoint(313, 94);
        headColour.addPoint(329, 60);
        headColour.addPoint(336, 10);
        headColour.addPoint(355, 46);
        headColour.addPoint(368, 96);
        headColour.addPoint(368, 96);
        headColour.addPoint(370, 37);
        headColour.addPoint(393, 117);
        headColour.addPoint(394, 109);
        headColour.addPoint(394, 157);
        headColour.addPoint(397, 153);
        headColour.addPoint(394, 186);
        headColour.addPoint(418, 129);
        headColour.addPoint(419, 170);
        headColour.addPoint(428, 125);
        headColour.addPoint(435, 132);
        headColour.addPoint(433, 174);
        headColour.addPoint(418, 191);
        headColour.addPoint(409, 205);
        headColour.addPoint(396, 213);

        gc.setColor(gojoSkin);
        gc.fillPolygon(headColour);

        // Head Outline

        gc.setColor(Color.black);
        gc.drawLine(196,246,190,240); //Jaw line
        gc.drawLine(190,240,173,163);
        gc.drawLine(183,214,177,214); // left ear
        gc.drawLine(177,214,173,202);
        gc.drawLine(173,202,157,179);
        gc.drawLine(157,179,157,135);
        gc.drawLine(161,165,163,175);
        gc.drawLine(163,175,176,179);
        gc.drawLine(392,201,390,207); // right ear
        gc.drawLine(390,207,396,212);
        gc.drawLine(396,212,408,206);
        gc.drawLine(408,206,420,190);
        gc.drawLine(420,190,420,190);
        gc.drawLine(420,190,433,174);
        gc.drawLine(433,174,435,132);
        gc.drawLine(435,132,429,124);
        gc.drawLine(400,178,401,183);
        gc.drawLine(401,183,422,173);
        gc.drawLine(422,173,428,156);
        gc.drawLine(428,146,430,135);
        gc.drawLine(430,135,427,133);
        gc.drawLine(425,157,424,152);
        gc.drawLine(418,141,415,138);
        gc.drawLine(413,144,414,148);
        gc.drawLine(411,150,411,164);
        gc.drawLine(411,164,402,172);

        //face outlines
        gc.drawLine(269,86,274,96); // nose
        gc.drawLine(308,82,301,93);
        gc.drawLine(275,114,275,124);
        gc.drawLine(275,124,273,130);
        gc.drawLine(265,160,272,169);
        gc.drawLine(272,169,275,178);
        gc.drawLine(275,178,264,170);

        Polygon mouth = new Polygon();
        mouth.addPoint(352, 206);
        mouth.addPoint(336, 206);
        mouth.addPoint(320, 203);
        mouth.addPoint(275, 203);
        mouth.addPoint(275, 203);
        mouth.addPoint(224, 208);
        mouth.addPoint(228, 209);
        mouth.addPoint(242, 227);
        mouth.addPoint(264, 234);
        mouth.addPoint(303, 234);
        mouth.addPoint(335, 220);
        mouth.addPoint(348, 208);

        gc.setColor(Color.decode("#f0ece1")); // dull white
        gc.fillPolygon(mouth);
        gc.setColor(Color.black);
        gc.drawPolygon(mouth);

        gc.drawLine(231,211,238,216); // teeth
        gc.drawLine(238,216,248,218);
        gc.drawLine(300,218,309,218);
        gc.drawLine(309,218,313,216);
        gc.drawLine(313,216,324,219);
        gc.drawLine(324,219,338,212);
        gc.drawLine(332,216,334,218);

        gc.drawLine(265,245,302,246); // chin


        // Glasses
        Polygon glassesLeft = new Polygon();
        glassesLeft.addPoint(170,118);
        glassesLeft.addPoint(175,113);
        glassesLeft.addPoint(176,121);
        glassesLeft.addPoint(170,128);

        Polygon glassesMid = new Polygon();
        glassesMid.addPoint(268,112);
        glassesMid.addPoint(272,112);
        glassesMid.addPoint(276,107);
        glassesMid.addPoint(293,107);
        glassesMid.addPoint(297,112);
        glassesMid.addPoint(301,112);
        glassesMid.addPoint(301,116);
        glassesMid.addPoint(296,117);
        glassesMid.addPoint(291,112);
        glassesMid.addPoint(275,111);
        glassesMid.addPoint(274,115);
        glassesMid.addPoint(272,116);
        glassesMid.addPoint(268,117);

        Polygon glassesRight = new Polygon();
        glassesRight.addPoint(387,119);
        glassesRight.addPoint(395,119);
        glassesRight.addPoint(395,125);
        glassesRight.addPoint(386,126);

        gc.setColor(Color.gray);
        gc.fillRect(175,113,9,9);  // RECTANGLES AND OVALS
        gc.fillPolygon(glassesLeft);
        gc.fillPolygon(glassesMid);
        gc.fillPolygon(glassesRight);

        gc.setColor(Color.white);
        gc.fillOval(183,78,86,70); // left lense
        gc.fillOval(302,78,86,71); // right lense

        gc.setColor(Color.black);
        gc.drawRect(175,113,9,9);// glasses left
        gc.drawLine(170,118,175,113);
        gc.drawLine(170,128,176,121);
        gc.drawPolygon(glassesMid);
        gc.drawLine(387,119,395,119);
        gc.drawLine(386,125,395,125);
        gc.drawOval(183,78,86,70); // left lense
        gc.drawOval(302,78,86,71); // right lense

        // Eyebrows
        Polygon leftEyebrow = new Polygon();
        leftEyebrow.addPoint(207, 56);
        leftEyebrow.addPoint(266, 76);
        leftEyebrow.addPoint(268, 84);

        Polygon rightEyebrow = new Polygon();
        rightEyebrow.addPoint(382, 65);
        rightEyebrow.addPoint(323, 70);
        rightEyebrow.addPoint(306, 78);
        rightEyebrow.addPoint(334, 75);

        gc.setColor(Color.decode("#E4E3F5"));
        gc.fillPolygon(leftEyebrow);
        gc.fillPolygon(rightEyebrow);

        // Hair
        Polygon hair = new Polygon();
        hair.addPoint(156, 176);
        hair.addPoint(130, 185);
        hair.addPoint(144, 170);
        hair.addPoint(156, 150);
        hair.addPoint(156, 141);
        hair.addPoint(144, 170);
        hair.addPoint(145, 157);
        hair.addPoint(148, 147);
        hair.addPoint(131, 155);
        hair.addPoint(107, 161);
        hair.addPoint(130, 146);
        hair.addPoint(143, 132);
        hair.addPoint(130, 146);
        hair.addPoint(112, 139);
        hair.addPoint(84, 138);
        hair.addPoint(125, 110);
        hair.addPoint(145, 88);
        hair.addPoint(116, 87);
        hair.addPoint(44, 67);
        hair.addPoint(92, 60);
        hair.addPoint(143, 35);
        hair.addPoint(63, -1);
        hair.addPoint(503, -1);
        hair.addPoint(483, 12);
        hair.addPoint(457, 20);
        hair.addPoint(536, 49);
        hair.addPoint(506, 63);
        hair.addPoint(478, 66);
        hair.addPoint(496, 74);
        hair.addPoint(524, 78);
        hair.addPoint(483, 77);
        hair.addPoint(458, 68);
        hair.addPoint(477, 104);
        hair.addPoint(513, 134);
        hair.addPoint(480, 135);
        hair.addPoint(458, 129);
        hair.addPoint(490, 173);
        hair.addPoint(442, 142);
        hair.addPoint(452, 179);
        hair.addPoint(468, 202);
        hair.addPoint(446, 193);
        hair.addPoint(430, 180);
        hair.addPoint(435, 198);
        hair.addPoint(442, 212);
        hair.addPoint(429, 203);
        hair.addPoint(419, 192);
        hair.addPoint(429, 181);
        hair.addPoint(434, 172);
        hair.addPoint(435, 131);
        hair.addPoint(429, 123);
        hair.addPoint(419, 171);
        hair.addPoint(418, 128);
        hair.addPoint(394, 187);
        hair.addPoint(396, 152);
        hair.addPoint(392, 162);
        hair.addPoint(394, 106);
        hair.addPoint(392, 118);
        hair.addPoint(370, 35);
        hair.addPoint(367, 94);
        hair.addPoint(355, 49);
        hair.addPoint(336, 10);
        hair.addPoint(334, 40);
        hair.addPoint(323, 79);
        hair.addPoint(313, 95);
        hair.addPoint(320, 56);
        hair.addPoint(322, 10);
        hair.addPoint(303, 45);
        hair.addPoint(282, 72);
        hair.addPoint(261, 93);
        hair.addPoint(247, 101);
        hair.addPoint(262, 76);
        hair.addPoint(259, 77);
        hair.addPoint(266, 50);
        hair.addPoint(272, 21);
        hair.addPoint(265, 26);
        hair.addPoint(249, 51);
        hair.addPoint(237, 73);
        hair.addPoint(230, 93);
        hair.addPoint(231, 66);
        hair.addPoint(238, 32);
        hair.addPoint(227, 34);
        hair.addPoint(211, 58);
        hair.addPoint(193, 100);
        hair.addPoint(193, 57);
        hair.addPoint(170, 119);
        hair.addPoint(173, 182);
        hair.addPoint(156, 131);
        hair.addPoint(157, 176);


        gc.setColor(Color.decode("#EEEDFF"));
        gc.fillPolygon(hair);

        gc.setColor(Color.black); // hair outlines
        gc.setStroke(0); // 2ND THICKNESS
        gc.drawPolygon(hair);
        gc.drawLine(168,129,166,144);
        gc.drawLine(166,144,160,119);
        gc.drawLine(160,119,162,61);
        gc.drawLine(159,131,156,108);
        gc.drawLine(149,146,153,129);
        gc.drawLine(194,53,198,36);
        gc.drawLine(198,36,206,13);
        gc.drawLine(285,0,256,17);
        gc.drawLine(256,17,214,34);
        gc.drawLine(214,34,238,32);
        gc.drawLine(238,32,317,0);
        gc.drawLine(283,23,269,64);
        gc.drawLine(269,64,261,77);
        gc.drawLine(336,9,338,0);
        gc.drawLine(370,35,367,18);
        gc.drawLine(393,105,391,77);
        gc.drawLine(390,65,381,49);
        gc.drawLine(398,151,406,133);
        gc.drawLine(406,133,414,100);
        gc.drawLine(414,100,415,81);
        gc.drawLine(409,137,417,106);
        gc.drawLine(418,125,421,115);
        gc.drawLine(428,124,429,94);
        gc.drawLine(457,128,453,119);
        gc.drawLine(476,66,470,61);
        gc.drawLine(526,55,503,56);
        gc.drawLine(503,56,475,51);
        gc.drawLine(457,21,434,4);

        gc.setFont(new Font("Arial", Font.BOLD, 20));
        gc.drawString("By: Leo.B", 415, 350);
        gc.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gc.drawString("'You Cryin'?'", 403, 325);
    }
}