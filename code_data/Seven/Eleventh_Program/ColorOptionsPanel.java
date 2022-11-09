package code_data.Seven.Eleventh_Program;

// *************************************************************************
//  ColorOptionsPanel.java
//
//  Represents the user interface for the ColorOptions program that lets
//  the user change background color by selecting a radio button.
// *************************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorOptionsPanel extends JPanel
{
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color [] color = new Color[NUM_COLORS];
    private JLabel heading;
    private JRadioButton [] colorButton = new JRadioButton[NUM_COLORS];
    private String [] c = {"Yellow","Cyan","Red","Green","Magenta"};

    // ------------------------------------------------------------------
    //  Sets up a panel with a label at the top and a set of radio buttons
    //  that control the background color of the panel.
    // ------------------------------------------------------------------
    public ColorOptionsPanel ()
    {
        // Set up heading and colors
        heading = new JLabel ("Choose the background color!");
        heading.setFont (new Font ("Helvetica", Font.BOLD, FONT_SIZE));

        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        for(int i = 0; i < NUM_COLORS; i++)
            colorButton[i] = new JRadioButton(c[i]);
        // Instantiate a ButtonGroup object and a ColorListener object
        ButtonGroup buttonGroup = new ButtonGroup();
        ColorListener colorListener = new ColorListener();
        for(int i = 0; i < NUM_COLORS; i++) {
            buttonGroup.add(colorButton[i]);
            this.add(colorButton[i]);
            colorButton[i].addActionListener(colorListener);
        }
        // Set up the panel
        add (heading);
        setBackground (Color.yellow);
        colorButton[0].setSelected(true);
        setPreferredSize (new Dimension (WIDTH, HEIGHT));

        // Group the radio buttons, add a ColorListener to each,
        // set the background color of each and add each to the panel.
    }

    // **************************************************************
    //   Represents the listener for the radio buttons.
    // **************************************************************
    private class ColorListener implements ActionListener
    {
        // --------------------------------------------------------
        //  Updates the background color of the panel based on
        //  which radio button is selected.
        // --------------------------------------------------------
        public void actionPerformed (ActionEvent event)
        {
            for(int i = 0; i < NUM_COLORS; i++)
                if(event.getActionCommand().equals(c[i]))
                    setBackground (color[i]);
        }
    }
}

