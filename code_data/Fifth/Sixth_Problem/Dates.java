package code_data.Fifth.Sixth_Problem;
// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ****************************************************************
import java.util.Scanner;
public class Dates
{
    public static void main(String[] args)
    {
        int month, day, year; //date read in from user
        int daysInMonth; //number of days in month read in
        boolean monthValid = true, yearValid = true, dayValid = true; //true if input from user is valid
        boolean leapYear; //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
//Get integer month, day, and year from user
        System.out.print("Please enter a number of day: ");
        day = scan.nextInt();
        System.out.print("Please enter a number of mouth: ");
        month = scan.nextInt();
        System.out.print("Please enter a number of year: ");
        year = scan.nextInt();
//Check to see if month is valid
        monthValid = (month >= 1 && month <=12) ? true : false;
//Check to see if year is valid
        yearValid = (year >= 1000 && year <= 1999) ? true : false;
//Determine whether it's a leap year
        leapYear = ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) ? true : false;
//Determine number of days in month
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                dayValid = (day >= 0 && day <= daysInMonth) ? true : false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                dayValid = (day >= 0 && day <= daysInMonth) ? true : false;
                break;
            case 2:
                daysInMonth = leapYear ? 29 : 28;
                dayValid = (day >= 0 && day <= daysInMonth) ? true : false;
                break;
        }
//User number of days in month to check to see if day is valid
//Determine whether date is valid and print appropriate message
        if(dayValid && yearValid && monthValid)
        {
            System.out.println("Date is valid!");
            if(leapYear)System.out.println("Date is leap_year");
        }
        else
            System.out.println("Date is not valid");
    }
}

