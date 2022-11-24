package code_data.Eight.Fifth_Program;
//********************************************************************
//  DotsPanel.java       Author: Lewis/Loftus
//
//  Represents the primary panel for the Dots program.
//********************************************************************

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class DotsPanel extends JPanel implements MouseListener {
    private final int SIZE = 6;  // radius of each dot

    private ArrayList<Point> pointList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public DotsPanel()
    {
        pointList = new ArrayList<Point>();

        addMouseListener(this);

        setBackground (Color.black);
        setPreferredSize (new Dimension(300, 200));
    }
    //-----------------------------------------------------------------
    //  Draws all of the dots stored in the list.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        page.setColor (Color.green);
        for (Point spot : pointList)
            page.fillOval (spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);
        page.drawString ("Count: " + pointList.size(), 5, 15);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pointList.add(e.getPoint());
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
