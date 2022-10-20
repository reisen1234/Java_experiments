package code_data.Fifth.Twelfth_Problem;
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int total_count = 1, less_data = 0, big_data = 0;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        //randomly generate the  number to guess
        numToGuess = Math.abs(generator.nextInt(10) + 1);
        //print message asking user to enter a guess
        System.out.print("Please enter a number to guess the message: ");
        //read in guess
        guess = scan.nextInt();
        while (guess != numToGuess)  //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            System.out.print("You guess number is wrong! And");
            if(guess < numToGuess)
            {
                System.out.println(" is less!");
                less_data++;
            }
            else
            {
                System.out.println(" is big!");
                big_data++;
            }
            total_count++;
            System.out.print("Please enter again: ");
            //get another guess from the user
            guess = scan.nextInt();
        }
        System.out.println("Congratulations! You guess number is right!");
        //print message saying guess is right
        System.out.println("The number of times you try is: " + total_count);
        System.out.println("The number of times the number is overly guessed is: " + big_data);
        System.out.println("The number of times the number is guessed too small is: " + less_data);
    }
}

