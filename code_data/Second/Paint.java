package code_data.Second;

 //**************************************************************
 //File: Paint.java
 //
 //Purpose: Determine how much paint is needed to paint the walls
 //of a room given its length, width, and height
 //***************************************************************
 import java.util.Scanner;
public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        int length, width, height,door,window;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner scan = new Scanner(System.in);
        //Prompt for and read in the length of the room
        System.out.println("Please enter the length of the room");
        length = scan.nextInt();
        //Prompt for and read in the width of the room
        System.out.println("Please enter the width of the room");
        width = scan.nextInt();
        //Prompt for and read in the height of the room
        System.out.println("Please enter the height of the room");
        height = scan.nextInt();
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = length * 2 * (length + width);
        System.out.println("Please enter how many windows :");
        window = scan.nextInt();
        System.out.println("Please enter how many doors :");
        door = scan.nextInt();
        //Compute the amount of paint needed
        paintNeeded = (totalSqFt - (door * 20.0 + window * 15.0))/COVERAGE;
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("The length,width,height of the house is " + length + " " + width + " "
        + " " + height + ". And the number of gallons of paint needed is " + paintNeeded);
    }
}

