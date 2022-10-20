package code_data.Fifth.Twenty_second_Problem;

import javax.swing.*;

//********************************************************************
//  PayCheck.java       Author: Lewis/Loftus
//
//  A program to compute the sum of wages for workers in every hour.
//********************************************************************
public class PayCheck {
    public static void main(String[] args)
    {
        String result, prompt;
        int hour, money, again;
        double ans = 0;
        do {
            prompt = JOptionPane.showInputDialog("Please enter worker working hours(one week): ");
            hour = Integer.parseInt(prompt);
            prompt = JOptionPane.showInputDialog("Please enter the wages about worker working hours: ");
            money = Integer.parseInt(prompt);
            if(hour > 40) {
                ans = 40.0 * money + (hour - 40.0) * 1.5 * money;
            }
            else
                ans = hour * money;
            result = "The worker's wages is: " + ans;
            JOptionPane.showMessageDialog(null,result);
            again = JOptionPane.showConfirmDialog(null,"Do another: ");
        }while(again == JOptionPane.YES_OPTION);
    }
}
