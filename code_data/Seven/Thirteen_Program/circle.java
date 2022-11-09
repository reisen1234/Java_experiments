package code_data.Seven.Thirteen_Program;

// ****************************************************************
// Circle.java
//
// Define a Circle class with methods to create and draw
// a circle of random size, color, and location.
//
// ****************************************************************


import java.awt.*;
import java.util.Random;

public class circle
{
    private int centerX, centerY;
    private int radius;
    private Color color;

    static Random generator = new Random();

    //---------------------------------------------------------
    // Creates a circle with center at point given, random radius and color
    //   -- radius 25..74
    //   -- color RGB value 0..16777215 (24-bit)
    //---------------------------------------------------------
    public circle(Point point)
    {
        radius = Math.abs(generator.nextInt())%50 + 25;
        color = new Color(Math.abs(generator.nextInt())% 16777216);
        centerX = point.x;
        centerY = point.y;
    }
    //---------------------------------------------------------
    // Draws circle on the graphics object given
    //---------------------------------------------------------
    public void draw(Graphics page)
    {
        page.setColor(color);
        page.fillOval(centerX-radius,centerY-radius,radius*2,radius*2);
    }
    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }
    public boolean isInside(Point p){
        if(Math.sqrt((centerX - p.x) * (centerX - p.x) + (centerY - p.y) * (centerY - p.y)) <= radius)
            return true;
        else return false;
    }
}
