package code_data.Eight.Fourth_Program;

// ********************************************************** 
// Player.java 
// 
// Defines a Player class that holds information about an athlete. 
// ********************************************************** 

import java.util.Random;
import java.util.Scanner;
public class Player
{
    private String name;
    private String team;
    private int jerseyNumber;
    //----------------------------------------------------------- 
    // Prompts for and reads in the player's name, team, and  
    // jersey number. 
    //-----------------------------------------------------------
    public void readPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        Scanner Scan = new Scanner(System.in);
        jerseyNumber = Scan.nextInt();
    }
    public boolean equals(Player player){
        if(this.name.equals(player.name) && this.jerseyNumber == player.jerseyNumber && this.team.equals(player.team))
            return true;
        else return false;
    }
}

