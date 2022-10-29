package code_data.Six.Second_Program;

import java.util.Scanner;

public class Comparisons {
    public static void main(String[] args) {
        String val1,val2,val3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first string:");
        val1 = scan.nextLine();
        System.out.print("Please enter the second string:");
        val2 = scan.nextLine();
        System.out.print("Please enter the third string:");
        val3 = scan.nextLine();
        System.out.println("The largest string is: " + Compare3.largest(val1,val2,val3));
        int inter1,inter2,inter3;
        System.out.print("Please enter the first integer:");
        inter1 = scan.nextInt();
        System.out.print("Please enter the second integer:");
        inter2 = scan.nextInt();
        System.out.print("Please enter the third integer:");
        inter3 = scan.nextInt();
        System.out.println("The largest string is: " + Compare3.largest(inter1,inter2,inter3));
    }
}
