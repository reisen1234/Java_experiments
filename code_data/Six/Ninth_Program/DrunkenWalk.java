package code_data.Six.Ninth_Program;

import java.util.Random;
import java.util.Scanner;

public class DrunkenWalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Boundary = 0, Step = 0,X = 0,Y = 0,max_step = 0, s = 0, fall = 0,flag = 0;
        System.out.print("Please enter the Boundary of test:");
        Boundary = scan.nextInt();
        System.out.print("Please enter the max of Step: ");
        Step = scan.nextInt();
        System.out.print("Please enter the Start_S and Start_Y: ");
        X = scan.nextInt();
        Y = scan.nextInt();
        RandomWalk randomWalk = new RandomWalk(Boundary,Step,X,Y);
        System.out.print("Please enter the max_step of drunk: ");
        max_step  = scan.nextInt();
        Random random = new Random();
        while(s <= max_step){
            randomWalk.takeStep();
            int step = 0;
            step = Math.abs(random.nextInt(Step + 1));
            s+=step;
            boolean a = randomWalk.inBounds(step);
            if(!a && flag == 0) {
                fall++;
                flag = 1;
            }
            if(a && flag == 1)
                flag = 0;
            System.out.println(randomWalk.toString());
        }
        System.out.println("The number of times a drunk fell into the water is: " + fall);
    }
}
