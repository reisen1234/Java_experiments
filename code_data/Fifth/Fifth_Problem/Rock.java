package code_data.Fifth.Fifth_Problem;
// ****************************************************************
// Rock.java
//
// Play Rock, Paper, Scissors with the user
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay = "R"; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine
//computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
//Get player's play -- note that this is stored as a string
        System.out.print("Please enter your choice: ");
        personPlay = scan.next();
//Make player's play uppercase for ease of comparison
        personPlay.toUpperCase();
//Generate computer's play (0,1,2)
        computerInt = Math.abs(generator.nextInt(3));
//Translate computer's randomly generated play to string
        switch (computerInt)
        {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
        }
//Print computer's play
//See who won. Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else
                System.out.println("Rock was wrapped up by paper. You loss!!");
        else if(personPlay.equals("S"))
            if(computerPlay.equals("R"))
                System.out.println("Scissors was crushed by rock. You loss!!");
            else
                System.out.println("Scissors shredded paper. You win!!");
        else
            if(computerPlay.equals("R"))
                System.out.println("Paper wrap up rock. You win!!");
            else
                System.out.println("Paper was shredded by scissors. You loss!!");
//... Fill in rest of code
    }
}
