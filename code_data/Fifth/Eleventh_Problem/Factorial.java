package code_data.Fifth.Eleventh_Problem;

import java.util.Scanner;
// ****************************************************************
//   Factorial.java
//
//   Count the result of number's factorial
//
// ****************************************************************
public class Factorial {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = 1, copy = 1;
        long ans = 1;
        System.out.print("Please enter the number to count the factorial: ");
        number = scan.nextInt();
        copy = number;
        for(int i = 1; i <= number; ++i)
        {
            ans*=i;
        }
        System.out.println(copy + "! = " + ans);
    }
}
