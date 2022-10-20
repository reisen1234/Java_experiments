package code_data.Fifth.Twenty_first_Problem;
//********************************************************************
//  EvenOdd.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************

import javax.swing.JOptionPane;

class EvenOdd
{
    //-----------------------------------------------------------------
    //  Determines if the value input by the user is even or odd.
    //  Uses multiple dialog boxes for user interaction.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        String numStr, result;
        int num, again;
        double ans = 0;
        do
        {
            numStr = JOptionPane.showInputDialog ("Enter an integer: ");

            num = Integer.parseInt(numStr);

            ans = Math.sqrt((double)num);

            result = "That number is " + ans;

            JOptionPane.showMessageDialog (null, result);

            again = JOptionPane.showConfirmDialog (null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);
    }
}

