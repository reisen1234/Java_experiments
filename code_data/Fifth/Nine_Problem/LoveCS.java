package code_data.Fifth.Nine_Problem;
// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your
//   passion for computer science
// ****************************************************************

import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Limit = 10;
        System.out.print("Please enter the number about limit_number: ");
        Limit = scan.nextInt();
        int count = 1, sum = 0;
        while (count <= Limit){
            System.out.println("I love Computer Science!!");
            sum += count;
            count++;
        }
        System.out.println("Printed this message " + (count - 1) + " times. ");
        System.out.println("The sum of the numbers from 1 to " + (count - 1) + " is " + sum + ".");
    }
}

