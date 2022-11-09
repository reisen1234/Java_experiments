package code_data.Seven.Tenth_Program;

// *******************************************************************
//   DrawPersonPanel.java
//
//   An program that uses the Graphics draw methods to draw a person.
// *******************************************************************
import javax.swing.JPanel;
import java.awt.*;
public class DrawPersonPanel extends JPanel
{
    private final int WIDTH = 600;
    private final int HEIGHT = 400;

    private int[] shirtX = {60,0,20,60,50,130,120,160,180,120};
    private int[] shirtY = {100,150,180,160,250,250,160,180,150,100};

    private int[] pantsX = {50,40,70,90,110,140,130};
    private int[] pantsY = {250,350,350,285,350,350,250};
    private int[] hairX = {60,70,80,90,100,110,120};
    private int[] hairY = {70,10,70,10,70,10,70};
    //--------------------------------------
    //  Constructor: Set up the panel.
    //--------------------------------------
    public DrawPersonPanel()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    //--------------------------------------
    //   Draw person
    //--------------------------------------

    public void paintComponent (Graphics page)
    {
        int move_x = 160;
        int move_y = 0;
        int[] ShirtX  = shirtX.clone();
        int[] ShirtY  = shirtY.clone();
        int[] PantsX  = pantsX.clone();
        int[] PantsY  = pantsY.clone();
        int[] HairX  = hairX.clone();
        int[] HairY  = hairY.clone();
        for(int i = 0; i < 3; i++){
            page.setColor(Color.blue);
            page.fillPolygon(ShirtX, ShirtY, ShirtX.length);
            page.setColor(Color.cyan);
            page.fillPolygon(PantsX, PantsY, PantsX.length);
            page.setColor(Color.green);
            page.fillPolygon(HairX, HairY, HairX.length);
            page.setColor(Color.black);
            movePerson(move_x,move_y,ShirtX,ShirtY,PantsX,PantsY,HairX,HairY);
            page.fillArc(60 + i * move_x,40 + i * move_y,60,60,0,360);
            page.drawLine(80 + i * move_x,150 + i * move_y,70 + i * move_x,200 + i * move_y);
            page.drawLine(70 + i * move_x,200 + i * move_y,100 + i * move_x,180 + i * move_y);
            page.drawLine(100 + i * move_x,180 + i * move_y,100 + i * move_x,225 + i * move_y);
        }
    }
    public void movePerson(int x, int y,int[] ShirtX,int[] ShirtY,int[] PantsX,int[] PantsY,int[] HairX, int[] HairY){
        for(int i = 0; i < ShirtX.length; i++) {
            ShirtX[i] += x;
            ShirtY[i] += y;
        }
        for(int i = 0; i < pantsX.length; i++) {
            PantsX[i] += x;
            PantsY[i] += y;
        }
        for(int i = 0; i < hairX.length; i++) {
            HairX[i] += x;
            HairY[i] += y;
        }
    }
}
