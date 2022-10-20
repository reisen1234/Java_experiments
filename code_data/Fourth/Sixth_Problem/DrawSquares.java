package code_data.Fourth.Sixth_Problem;

import javax.swing.*;
import java.awt.*;
public class DrawSquares {
    public static void main(String[] args){
        Square square = new Square();
        JFrame frame = new JFrame("Draw square");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        int width = square.Square_size;
        JPanel jPanel = new JPanel();
        jPanel.setBounds(square.coordinate_x,square.coordinate_y,square.Square_size,square.Square_size);
        jPanel.setBackground(new Color(square.color_r,square.color_g,square.color_b));
        frame.setBackground(Color.white);
        frame.add(jPanel);
        frame.setSize(1200,1200);
        frame.setVisible(true);
    }
}
