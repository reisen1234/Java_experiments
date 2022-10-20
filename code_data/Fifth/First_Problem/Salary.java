package code_data.Fifth.First_Problem;
// ***************************************************************
// Salary.java
// Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        double currentSalary; // current annual salary
        double rating; // performance rating
        double raise = 0.0; // dollar amount of the raise
        Scanner scan = new Scanner(System.in);
// Get the current salary and performance rating
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating: ");
        rating = scan.nextDouble();
// Compute the raise -- Use if ... else ...
        if (rating == 1)
            raise = 0.06 * currentSalary;
        else if (rating == 2)
            raise = 0.04 * currentSalary;
        else if (rating == 3)
            raise = 0.015 * currentSalary;
// Print the results
        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + (currentSalary + raise));
    }
}

