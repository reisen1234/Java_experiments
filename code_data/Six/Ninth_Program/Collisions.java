package code_data.Six.Ninth_Program;

import java.util.Random;
import java.util.Scanner;

public class Collisions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Boundary = 0, Step = 0,X = 0,Y = 0,max_step = 0, s = 0, flag = 0;
        int Boundary2 = 0, Step2 = 0,X2 = 0,Y2 = 0,max_step2 = 0;
        System.out.print("Please enter the Boundary:");
        Boundary = scan.nextInt();
        System.out.print("Please enter the max_step: ");
        Step = scan.nextInt();
        System.out.print("Please enter the Start_S and Start_Y of first Collisions: ");
        X = scan.nextInt();
        Y = scan.nextInt();
        RandomWalk randomWalk = new RandomWalk(Boundary,Step,X,Y);
        System.out.print("Please enter the Start_S and Start_Y of second Collisions: ");
        X2 = scan.nextInt();
        Y2 = scan.nextInt();
        RandomWalk randomWalk2 = new RandomWalk(Boundary,Step,X2,Y2);
        Random random = new Random();
        while(true){
            randomWalk.takeStep();
            randomWalk2.takeStep();
            int step = 0,step2 = 0;
            step = Math.abs(random.nextInt(Step + 1));
            boolean a = randomWalk.inBounds(step);
            boolean b = randomWalk2.inBounds(step);
            if(a&&b){
                if(randomWalk.getX() == randomWalk2.getX() && randomWalk.getY() == randomWalk2.getY()) {
                    s++;
                    System.out.println(randomWalk.toString() + randomWalk2.toString());
                }
            }
            else break;
        }
        System.out.println("Number of particle collisions is: " + s);
        System.out.println(randomWalk.toString() + randomWalk2.toString());
    }
}
