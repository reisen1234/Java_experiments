package code_data.Seven.Thirteen_Program;

//********************************************************************
//  Circles.java
//
//  Demonstrates mouse events and drawing on a panel.
//  Derived from Dots.java in Lewis and Loftus
//********************************************************************

import code_data.Seven.Twelfth_Program.CirclePanel;

import javax.swing.*;

public class circles
{
    //-----------------------------------------------------------------
    //  Creates and displays the application frame.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        JFrame circlesFrame = new JFrame ("circles");
        circlesFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        circlesFrame.getContentPane().add (new circlePanel());

        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}
