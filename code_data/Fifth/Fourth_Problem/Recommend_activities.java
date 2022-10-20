package code_data.Fifth.Fourth_Problem;

import java.util.Scanner;

// ***************************************************************
// Recommend_activities.java
//
//
// To recommend activities of sport to visitor
// ***************************************************************
public class Recommend_activities {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        System.out.print("Please enter today's temperature: ");
        temp = scan.nextInt();
        if(temp > 95 || temp < 20)
            System.out.println("Visit our shops!");
        else if(temp >= 80)
            System.out.println("You can swim.");
        else if(temp >= 60 && temp < 80)
            System.out.println("You can tennis.");
        else if(temp >= 40 && temp < 60)
            System.out.println("You can golf.");
        else if(temp < 40)
            System.out.println("You can skiing.");
    }
}
