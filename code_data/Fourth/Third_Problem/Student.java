package code_data.Fourth.Third_Problem;
// ****************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
//-----------------------------------------------
//constructor
//-----------------------------------------------
    private String Student_Name;
    private double First_Exam_result;
    private double Second_Exam_result;
    public Student(String studentName) {
        First_Exam_result = 0;
        Second_Exam_result = 0;
        Student_Name = studentName;
//add body of constructor
    }
    //-----------------------------------------------
//inputGrades: prompt for and read in student's grades for test1 and test2.
//Use name in prompts, e.g., "Enter Joe's score for test1".
//-----------------------------------------------
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the result of " + Student_Name + "'s first exam: ");
        First_Exam_result = scan.nextDouble();
        System.out.print("Please enter the result of " + Student_Name + "'s second exam: ");
        Second_Exam_result = scan.nextDouble();
//add body of inputGrades
    }
    //-----------------------------------------------
    public double getAverage(){
       if(First_Exam_result != 0 && Second_Exam_result != 0)
           return (First_Exam_result + Second_Exam_result)/2.0;
       else {
           System.out.println("No data!");
           return 0;
       }
    }
//getAverage: compute and return the student's test average
//-----------------------------------------------
//add header for getAverage
    {
//add body of getAverage
    }
    //-----------------------------------------------
//getName: print the student's name
    public String getName() {
        return Student_Name;
    }
//-----------------------------------------------
//add header for printName
    {
//add body of printName
    }
}

