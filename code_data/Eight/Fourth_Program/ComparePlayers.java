package code_data.Eight.Fourth_Program;

// **************************************************************
// ComparePlayers
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **************************************************************
import java.util.Scanner;
public class ComparePlayers
{
    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();

        //Prompt for and read in information for player 1
        player1.readPlayer();
        //Prompt for and read in information for player 2
        player2.readPlayer();
        //Compare player1 to player 2 and print a message saying
        if(player1.equals(player2)){
            System.out.println("They are same");
        }
        else System.out.println("They are different");
        //whether they are equal

    }
}
