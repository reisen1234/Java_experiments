package code_data.Third;
// **************************************************
//   Dice.java
//
//   Simulates the condition of the dice
// **************************************************
import java.util.*;
public class Dice {
    public static void main(String[] args){
        Random Dice = new Random();
        int Dice_num_1 = 0, Dice_num_2 = 0;
        Dice_num_1 = Math.abs(Dice.nextInt(6)) + 1;
        Dice_num_2 = Math.abs(Dice.nextInt(6)) + 1;
        System.out.println("When the dice stop spinning,the points of first dice is " + Dice_num_1
        + ",the points of second dice is " + Dice_num_2 + ".\nAnd total points of the two dices is " +
                (Dice_num_1 + Dice_num_2));
    }
}
