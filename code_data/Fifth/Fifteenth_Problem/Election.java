package code_data.Fifth.Fifteenth_Problem;
// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of
//   precincts each candidate carries, and the
//   maximum winning margin in a precinct.
// **************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Election
{
    public static void main (String[] args)
    {
        DecimalFormat fmt = new DecimalFormat();
        fmt.applyPattern("#.##");
        int votesForPolly;  // number of votes for Polly in each precinct
        int votesForErnest; // number of votes for Ernest in each precinct
        int totalPolly = 0;     // running total of votes for Polly
        int totalErnest = 0;    // running total of votes for Ernest
        String response;    // answer (y or n) to the "more precincts" question
        int win_polly = 0;
        int win_ernest = 0;
        int draw = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");
        System.out.println ();

        // Initializations
        do {
            System.out.print("Please enter the vote of Polly in this country:  ");
            votesForPolly = scan.nextInt();
            System.out.print("Please enter the vote of Ernest in this country:  ");
            votesForErnest = scan.nextInt();
            System.out.print("Is there another area: ");
            response  = scan.next();
            totalPolly += votesForPolly;
            totalErnest += votesForErnest;
            if(votesForPolly > votesForErnest)win_polly++;
            else if(votesForPolly < votesForErnest)win_ernest++;
            else draw++;
        }while(response.equals("Y")||response.equals("y"));
        // Loop to "process" the votes in each precinct
        System.out.println("The number of polly's vote is:  " + totalPolly +
                ". Polly's votes is:  " + fmt.format(((double)totalPolly)/(totalPolly+totalErnest)*100.0) + "%");
        System.out.println("The number of ernest's vote is:  " + totalErnest +
                ". Ernest's votes is:  " + fmt.format((double)totalErnest/(totalPolly+totalErnest)*100.0) + "%");
        // Print out the results
        System.out.println("Polly won in " + win_polly + " regions.");
        System.out.println("Ernest won in " + win_ernest + " regions.");
        System.out.println("The number of draws is: " + draw);

    }
}
