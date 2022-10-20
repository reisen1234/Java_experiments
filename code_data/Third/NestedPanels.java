package code_data.Third;
//********************************************************************
// NestedPanels.java Author: Lewis/Loftus
//
// Demonstrates a basic component hierarchy.
//********************************************************************
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.State;
public class NestedPanels
{
    //-----------------------------------------------------------------
// Presents two colored panels nested within a third.
//-----------------------------------------------------------------
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Nested Panels");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
// Set up first subpanel
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize (new Dimension(150, 100));
        subPanel1.setBackground (Color.green);
        JLabel label1 = new JLabel ("One");
        subPanel1.add (label1);
// Set up second subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize (new Dimension(150, 100));
        subPanel2.setBackground (Color.red);
        JLabel label2 = new JLabel ("Two");
        subPanel2.add (label2);
//Set up third subpanel
        JPanel subPanel3 = new JPanel();
        subPanel3.setPreferredSize(new Dimension(300,100));
        subPanel3.setBackground(Color.pink);
        JLabel label3 = new JLabel("Three");
        subPanel3.add(label3);
//Set up Fourth subpanel
        JPanel subPanel4 = new JPanel();
        subPanel4.setPreferredSize(new Dimension(320,20));
        subPanel4.setBackground(Color.BLUE);
        JLabel label4 = new JLabel("My Panels");
        subPanel4.add(label4);
// Set up primary panel
        int width = 320;
        int height = 260;
        Dimension d = new Dimension(width, height);
        JPanel primary = new JPanel();
        primary.setPreferredSize(d);
        primary.setBackground (Color.blue);
        primary.add (subPanel1);
        primary.add (subPanel2);
        primary.add(subPanel3);
        primary.add(subPanel4);
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }

}

