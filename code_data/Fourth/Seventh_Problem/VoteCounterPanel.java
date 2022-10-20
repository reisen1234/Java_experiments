package code_data.Fourth.Seventh_Problem;

//*********************************************************
// VoteCounterPanel.java
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
//*********************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VoteCounterPanel extends JPanel
{
    private int votesForJoe;
    private int votesForSam;
    private JButton joe;
    private JButton Sam;
    private JLabel labelJoe;
    private JLabel labelSam;
    //----------------------------------------------
// Constructor: Sets up the GUI.
//----------------------------------------------
    public VoteCounterPanel()
    {
        votesForJoe = 0;
        votesForSam = 0;
        joe = new JButton("Vote for Joe");
        Sam = new JButton("Vote for Sam");
        joe.addActionListener(new JoeButtonListener());
        Sam.addActionListener(new SamButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(joe);
        add(labelJoe);
        add(Sam);
        add(labelSam);
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.cyan);
    }
    //***************************************************
// Represents a listener for button push (action) events
//***************************************************
    private class JoeButtonListener implements ActionListener
    {
        //----------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe + "\n");
        }
    }
    private class SamButtonListener implements ActionListener
    {
        //----------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}

