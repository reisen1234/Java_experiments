package code_data.Seven.Third_Program;

import java.util.Scanner;

// ****************************************************************
// Reversing_an_Array.java
//
// Reversing an Array
//
// ****************************************************************
public class Reversing_an_Array {
    public static void main(String[] args) {
        int size = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer of array's size: ");
        size = scan.nextInt();
        int[] array = new int[size];
        for(int i = 0 ;i < size; i++)array[i] = scan.nextInt();
        System.out.println("The array element before the rotation: ");
        for(int iter:array)System.out.print(iter + " ");
        int left = 0, right = size - 1;
        while(left < right){
            array[left] = array[left]^array[right];
            array[right] = array[left]^array[right];
            array[left] = array[left]^array[right];
            left++;
            right--;
        }
        System.out.println("\nThe array element after the rotation: ");
        for(int iter:array)System.out.print(iter + " ");
    }
}
