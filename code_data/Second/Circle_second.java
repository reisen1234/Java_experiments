package code_data.Second;
//**********************************************************
// Circle_second.java
//
// Print the area of a circle with two different radii
//**********************************************************
public class Circle_second {
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        int radius = 10;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("The area of first circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of first circle with radius " + radius +
                " is " + circumference);
        int radius_second = radius * 2;
        double area_second = PI * radius_second * radius_second;
        double circumference_second = 2 * PI * radius_second;
        System.out.println("The area of second circle with radius " + radius_second +
                " is " + area_second);
        System.out.println("The circumference of second circle with radius " + radius_second +
                " is " + circumference_second);
        System.out.println("The magnification of area and circumference between tow circle is"+
                area_second/area + "and" + circumference_second/circumference);
    }
}
