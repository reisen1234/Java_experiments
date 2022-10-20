package code_data.Fourth.Sixth_Problem;

import org.w3c.dom.css.RGBColor;
import java.util.*;
// ********************************************
//  Square.java
//
//  To draw a square;
//
// ********************************************
public class Square {
    public int Square_size;
    public int coordinate_x;
    public int coordinate_y;
    public int color_r, color_g, color_b;
    private static Random generator = new Random();
    public Square(){
        color_r =  Math.abs(generator.nextInt(256));
        color_g =  Math.abs(generator.nextInt(256));
        color_b =  Math.abs(generator.nextInt(256));
        Square_size = Math.abs(generator.nextInt(101)) + 100;
        coordinate_x = Math.abs(generator.nextInt(401));
        coordinate_y = Math.abs(generator.nextInt(401));
    }
}
