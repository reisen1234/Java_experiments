package code_data.Fifth.Seventeenth_Peoblem;
// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
    public static void main (String[] args)
    {
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks (spaces) in the phrase
        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();
        while (true)
        {

            // Read in a string and find its length
            System.out.print ("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            if(phrase.equals("quit"))break;
            length = phrase.length();
            // Initialize counts
            countBlank = 0;
            int countA = 0;
            int countE = 0;
            int countS = 0;
            int countT = 0;
            // a for loop to go through the string character by character
            // and count the blank spaces
            for(int i = 0; i < length; i++)
            {
                ch = phrase.charAt(i);
                switch (ch)
                {
                    case 'a':
                    case 'A':  countA++;
                        break;
                    case 'E':
                    case 'e':  countE++;
                        break;
                    case 'T':
                    case 't':  countT++;
                        break;
                    case 'S':
                    case 's':  countS++;
                        break;
                    case ' ':  countBlank++;
                        break;
                }

            }
            // Print the results
            System.out.println ();
            System.out.println ("Number of blank spaces: " + countBlank);
            System.out.println ("Number of A characters: " + countA);
            System.out.println ("Number of E characters: " + countE);
            System.out.println ("Number of T characters: " + countT);
            System.out.println ("Number of S characters: " + countS);
            System.out.println ();
        }
    }
}
