package code_data.Second;
import java.util.*;
// *******************************************************************
// Average.java
//
// Read three integers from the user and print their average
// *******************************************************************
public class Average {
    public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;
// get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average");
//compute the average
        val1 = scan.nextInt();
        val2 = scan.nextInt();
        val3 = scan.nextInt();
        average = (val1 + val2 + val3)/3.0;
        System.out.println("The average is " + average);
//print the average
    }

}
