package code_data.Seven.Frist_Program;

// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        int total = 0;
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int max = 0, min = 0;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            if(sales[i] > sales[max])max = i;
            if(sales[i] < sales[min])min = i;
        }
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println("     " + (i + 1) + "         " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The avg of sales is" + (double)sum/5.0);
        System.out.println("Salesperson " + (max + 1) + " had the highest sale with $" + sales[max]+".");
        System.out.println("Salesperson " + (min + 1) + " had the minimum sale with $" + sales[min]+".");
        System.out.print("Please enter a number of sales:");
        int sale = 0, count = 0;
        sale = scan.nextInt();
        for(int iter: sales)
            if(iter > sale)count++;
        System.out.println("The number of people who exceeded was: " + count);


    }
}

