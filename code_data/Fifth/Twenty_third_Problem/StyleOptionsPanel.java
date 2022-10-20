package code_data.Fifth.Twenty_third_Problem;
//********************************************************************
//  StyleOptionsPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
    private int fontSize = 36;
    private int style = Font.PLAIN;
    private JLabel saying;
    private JCheckBox bold, italic;
    private JRadioButton small, medium, large;

    //-----------------------------------------------------------------
    //  Sets up a panel with a label and some check boxes that
    //  control the style of the label's font.
    //-----------------------------------------------------------------
    public StyleOptionsPanel()
    {
        saying = new JLabel ("Say it with style!");
        saying.setFont (new Font ("Helvetica", style, fontSize));
        ButtonGroup group = new ButtonGroup();
        bold = new JCheckBox ("Bold");
        bold.setBackground (Color.cyan);
        italic = new JCheckBox ("Italic");
        italic.setBackground (Color.cyan);
        small = new JRadioButton("Small Font");
        small.setBackground(Color.cyan);
        medium = new JRadioButton("Medium Font");
        medium.setBackground(Color.cyan);
        large = new JRadioButton("Large Font");
        large.setSelected(true);
        large.setBackground(Color.cyan);
        group.add(small);
        group.add(medium);
        group.add(large);
        StyleListener listener = new StyleListener();
        bold.addItemListener (listener);
        italic.addItemListener (listener);

        StyleListener_button listener_button = new StyleListener_button();
        small.addItemListener(listener_button);
        medium.addItemListener(listener_button);
        large.addItemListener(listener_button);

        add (saying,0,0);
        add (bold,1,0);
        add (italic,1,1);
        add(small,2,0);
        add(medium,2,1);
        add(large,2,2);
        setBackground (Color.cyan);
        setPreferredSize (new Dimension(300, 140));
    }


    //*****************************************************************
    //  Represents the listener for both check boxes.
    //*****************************************************************
    private class StyleListener implements ItemListener
    {
        //--------------------------------------------------------------
        //  Updates the style of the label font style.
        //--------------------------------------------------------------
        public void itemStateChanged (ItemEvent event)
        {
            style = Font.PLAIN;

            if (bold.isSelected())
                style = Font.BOLD;

            if (italic.isSelected())
                style += Font.ITALIC;

            saying.setFont (new Font ("Helvetica", style, fontSize));
        }
    }
    private class StyleListener_button implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            if(small.isSelected()) {
                fontSize = 12;
            }
            else if(medium.isSelected()) {
                fontSize = 24;
            }
            else {
                fontSize = 36;
            }
            saying.setFont(new Font("Helvetica", style, fontSize));
        }
    }
}
