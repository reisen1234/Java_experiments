package code_data.Fourth.Eighth_Problem;
//****************************************************************
// BMIPanel.java
//
// Computes body mass index in a GUI.
//****************************************************************

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class BMIPanel extends JPanel
{
    private int WIDTH = 300;
    private int HEIGHT = 150;
    private JLabel heightLabel, weightLabel, BMILabel, resultLabel;
    private JTextField height, weight;
    private JButton calculate;

    //--------------------------------------------------------------
// Sets up the GUI.
//--------------------------------------------------------------
    public BMIPanel()
    {

//create labels for the height and weight textfields
        heightLabel = new JLabel ("Your height in inches: ");
        weightLabel = new JLabel ("Your weight in pounds: ");
        BMILabel = new JLabel("This is your BMI calculator, Please Enter data");
//create a "this is your BMI" label
        resultLabel = new JLabel("The result of BMI compute is: ");
//create a result label to hold the BMI value
        height = new JTextField();
        height.setPreferredSize(new Dimension(80,20));
        height.setEditable(true);
        height.isFocusable();
        height.setEnabled(true);
//create a JTextField to hold the person's height in inches
        weight = new JTextField();
        weight.setPreferredSize(new Dimension(80,20));
        weight.setEditable(true);
        weight.isFocusable();
        weight.setEnabled(true);
//create a JTextField to hold the person's weight in pounds
        calculate = new JButton("The result of BMI: ");
        calculate.addActionListener(new BMIListener());
//create a button to press to calculate BMI
//create a BMIListener and make it listen for the button to be pressed
        add(BMILabel,0,0);
        add(heightLabel,1,1);
        add(height,1,2);
        add(weightLabel,3,3);
        add(weight,3,4);
        add(calculate,5,5);
        add(resultLabel,6,6);
//add the button to the panel
//add the BMI label to the panel
//add the label that holds the result to the panel
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
//set the size of the panel to the WIDTH and HEIGHT constants
        setBackground(new Color(255,102,153));
//set the color of the panel to whatever you choose
    }

    //****************************************************************
// Represents an action listener for the calculate button.
//****************************************************************
    private class BMIListener implements ActionListener
    {
        //-----------------------------------------------------------
// Compute the BMI when the button is pressed
//------------------------------------------------------------
        public void actionPerformed (ActionEvent event)
        {
            DecimalFormat d = new DecimalFormat("#.000");
            String heightText, weightText, bmis;
            int heightVal, weightVal;
            double bmi;
//get the text from the height and weight textfields
            heightLabel.setText("Your height in inches: ");
            weightLabel.setText("Your weight in pounds: ");
            heightText = height.getText();
            weightText = weight.getText();
            heightVal = Integer.parseInt(heightText);
            weightVal = Integer.parseInt(weightText);
//Use Integer.parseInt to convert the text to integer values
            bmi = (703.00*(weightVal)/(double)(heightVal*heightVal));
            bmis = d.format(bmi);
//Calculate the bmi = 703 * weight in pounds / (height in inches)^2
            resultLabel.setText("This is the result of your BMI compute: " + bmis);

//Put result in result label. Use Double.toString to convert double to string.

        }
    }
}


