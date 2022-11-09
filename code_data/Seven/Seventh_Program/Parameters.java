package code_data.Seven.Seventh_Program;
//********************************************************
//  Parameters.java
//
//  Illustrates the concept of a variable parameter list.
//********************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Parameters {
    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args) {
        double mean1, mean2, mean3, mean4,mean5;
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        mean1 = average(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);
        mean3 = average(13);
        mean4 = average();
        int j = 0;
        int[] arr = new int[20];
        for(int i = 0; i < 20; i++){
            value = scanner.nextInt();
            if(value <= 0)break;
            else arr[j++] = value;
        }
        mean5 = average(arr);
        int min = 0;
        min = minimum(1,2,3,4,0,80,-1);
        System.out.println("The smallest number is " + min);
        System.out.println("mean1 = " + mean1);
        System.out.println("mean2 = " + mean2);
        System.out.println("mean3 = " + mean3);
        System.out.println("mean4 = " + mean4);
        System.out.println("mean5 = " + mean5);
    }

    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average(int... list) {
        double result = 0.0;

        if (list.length != 0) {
            int sum = 0;
            for (int num : list)
                sum += num;
            result = (double) sum / list.length;
        }
        return result;
    }
    public static int minimum(int...list){
        int min = 0;
        if(list.length != 0){
            min = list[0];
            for(int num:list){
                if(num < min)min = num;
            }
        }
        return min;
    }
}

