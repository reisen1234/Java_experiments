package code_data.Second;
// ************************************************************************
//LabGrade.java
//This program computes a student's lab grade from
//the grades on the three components of lab: the pre-lab
//assignment, the lab itself, and the post-lab assignment.
// ***********************************************************************
import java.text.DecimalFormat;
import java.util.Scanner;
public class LabGrade
{
    public static void main (String[] args)
    {
        // Declare constants
        final double IN_WEIGHT = 0.6; // in-class weight is 60%
        final double OUT_WEIGHT = 0.4; // out-of-class weight is 40%
// Declare variables
        int preLabPts;//number of points earned on the pre-lab assignment
        int preLabMax;//maximum number of points possible for pre-lab
        int labPts;//number of points earned on the lab
        int labMax;//maximum number of points possible for lab
        int postLabPts;//number of points earned on the post-lab assignment
        int postLabMax;//maximum number of points possible for the post-lab
        double outClassAvg; //average on the out of class (pre and post) work
        double inClassAvg;//average on the in-class work
        double labGrade; //final lab grade
        Scanner scan = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.000");
// Get the input
        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab? ");
        postLabMax = scan.nextInt();
        System.out.println();
// Calculate the average for the out of class work
        outClassAvg = ((double) (preLabPts + postLabPts) / (double)(preLabMax + postLabMax)) * 100.0;
// Calculate the average for the in-class work
        inClassAvg = ((double)labPts / labMax) * 100.0;
// Calculate the weighted average taking 40% of the out-of-class average
// plus 60% of the in-class
        labGrade = OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg;
// Print the results
        System.out.println("Your average on out-of-class work is " + d.format(outClassAvg) + "%");
        System.out.println("Your average on in-class work is " + d.format(inClassAvg) + "%");
        System.out.println("Your lab grade is " + d.format(labGrade) + "%");
        System.out.println();
    }
}

