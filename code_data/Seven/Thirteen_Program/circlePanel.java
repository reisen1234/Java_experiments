package code_data.Seven.Thirteen_Program;

//*************************************************************************
//  CirclePanel.java
//
//  Represents the primary panel for the Circles program on which the
//  circles are drawn.  Derived from the Lewis and Loftus DotsPanel class.
//*************************************************************************

import code_data.Seven.Twelfth_Program.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class circlePanel extends JPanel
{
    private final int WIDTH = 600, HEIGHT = 400;
    private code_data.Seven.Thirteen_Program.circle circle;

    //-----------------------------------------------------------------
    //  Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public circlePanel()
    {
        addMouseMotionListener(new circlesListener());
        setPreferredSize (new Dimension(WIDTH, HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the current circle, if any.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        if (circle != null)
            circle.draw(page);
    }

    //*****************************************************************
    //  Represents the listener for mouse events.
    //*****************************************************************
    private class circlesListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event){
            if (circle == null)
            {
                circle = new circle(event.getPoint());
            }else{
                circle.move(event.getPoint());
            }
            repaint();
        }
        public void mouseMoved(MouseEvent event){
        }
    }
}
