package code_data.Fifth.Ninteenth_Problem;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// **********************************************************
//   Count.java
//
//   To draw a rainbow
//
// **********************************************************
public class Rainbow extends JPanel {
    public Rainbow()
    {
        setBackground(Color.white);
        setPreferredSize(new Dimension(300,150));
    }
    public void paintComponent(Graphics page)
    {
        int x = 0, y = 0;
        int wh = 300, r = 0, g = 0, b = 0,r_size = 20;
        Random rgb = new Random();
        for(int i = 0; i < 7; i++)
        {
            r = Math.abs(rgb.nextInt(256));
            g = Math.abs(rgb.nextInt(256));
            b = Math.abs(rgb.nextInt(256));
            page.setColor(new Color(r, g, b));
            page.fillArc(x,y,wh,wh,0,180);
            wh-=(2*r_size);
            x+=r_size;y+=r_size;
        }
    }
}
