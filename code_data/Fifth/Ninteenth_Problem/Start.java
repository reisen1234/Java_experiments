package code_data.Fifth.Ninteenth_Problem;

import javax.swing.*;

public class Start {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Rainbow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Rainbow rainbow = new Rainbow();
        frame.getContentPane().add(rainbow);
        frame.pack();
        frame.setVisible(true);
    }
}
