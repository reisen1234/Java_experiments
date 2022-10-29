package code_data.Six.Ninth_Program;

import java.util.Scanner;

public class TestWalk {
    public static void main(String[] args) {
        int boundary, step,x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the boundary of test: ");
        boundary = scan.nextInt();
        System.out.print("Please enter the max of step: ");
        step = scan.nextInt();
        System.out.print("Please enter the Start_x and Start_y: ");
        x = scan.nextInt();
        y = scan.nextInt();
        RandomWalk randomWalk2 = new RandomWalk(boundary,step,x,y);
        randomWalk2.walk();
    }
}
