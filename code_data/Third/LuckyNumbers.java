package code_data.Third;
// **************************************************
//   LuckyNumbers.java
//
//   To generate three random "lucky" numbers
// **************************************************
import java.util.Random;
public class LuckyNumbers {
    public static void main (String[] args)
    {
        Random generator = new Random();
        int lucky1, lucky2, lucky3;

        // Generate lucky1 (a random integer between 50 and 79) using the
        // nextInt method (with no parameter)

        lucky1 = Math.abs(generator.nextInt(30)) + 50;

        // Generate lucky2 (a random integer between 90 and 100) using the
        // nextInt method with an integer parameter

        lucky2 = Math.abs(generator.nextInt(11))+90;

        //Chapter 3: Using Classes and Objects  39
        // Generate lucky3 (a random integer between 11 and 30) using nextFloat

        lucky3 = (int)(Math.abs(generator.nextFloat(20))+ 11);

        System.out.println ("Your lucky numbers are " + lucky1 + ", " + lucky2
                + ", and " + lucky3);
    }
}
