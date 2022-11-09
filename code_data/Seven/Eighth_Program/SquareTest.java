package code_data.Seven.Eighth_Program;
// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ****************************************************************
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\untitled\\src\\code_data\\Seven\\Eighth_Program\\magicData";
        Scanner scan = new Scanner(new File(fileName));
        int count = 1; //count which square we're on
        int size = scan.nextInt(); //size of next square
//Expecting -1 at bottom of input file
        while (size != -1)
        {
//create a new Square of the given size
            Square square = new Square(size);
            square.readSquare(scan);
//call its read method to read the values of the square
            System.out.println("\n******** Square " + count + " ********");
//print the square
            square.printSquare();
//print the sums of its rows
            for(int i = 0; i < square.square.length; i++)
                System.out.println("The sum of " + (i + 1) + " row is " + square.sumRow(i));
//print the sums of its columns
            for(int i = 0; i < square.square.length; i++)
                System.out.println("The sum of " + (i + 1) + " col is " + square.sumCol(i));
//print the sum of the main diagonal
            System.out.println("The sum of the main diagonal is " + square.sumMainDiag());
//print the sum of the other diagonal
            System.out.println("The sum of the other diagonal is " + square.sumOtherDiag());
//determine and print whether it is a magic square
            if(square.magic())System.out.println("The square is a magic square");
            else System.out.println("The square wasn't a magic square");
//get size of next square
            count++;
            size = scan.nextInt();
        }
    }
}

