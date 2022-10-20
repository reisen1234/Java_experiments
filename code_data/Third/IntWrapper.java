package code_data.Third;
// *************************************************************
// Distance.java
//
// Base conversion
// *************************************************************\
import java.util.Scanner;
public class IntWrapper {
    public static void main(String[] args)
    {
        int num;
        Integer change = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        num = scan.nextInt();
        System.out.println("The number's binary is " + change.toBinaryString(num));
        System.out.println("The number's octal is " + change.toOctalString(num));
        System.out.println("The number's hexadecimal is " + change.toHexString(num));
        System.out.println("The max number of int is " + change.MAX_VALUE);
        System.out.println("The least number of int is " + change.MIN_VALUE);
        String num1,num2;
        System.out.print("Please Enter first string: ");
        num1 = scan.next();;
        System.out.print("Please Enter second string: ");
        num2 = scan.next();
        Integer change1 = 0;
        Integer change2 = 0;
        System.out.println("The first string is " + change1.valueOf(num1).intValue());
        System.out.println("The second string is " + change1.valueOf(num2).intValue());
        System.out.println("The two string's sum is " + (change1.valueOf(num1).intValue()+change1.valueOf(num2).intValue()));

    }
}
