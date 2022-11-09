package code_data.Seven.Second_Program;

import java.util.Scanner;

// ****************************************************************
// Question_test.java
//
//Procedure for grading arithmetic tests
//
// ****************************************************************
public class Question_test {
    public static void main(String[] args) {
        int question = 0;
        String data = "y";
        Scanner scan = new Scanner(System.in);
        System.out.print("How many question have: ");
        question = scan.nextInt();
        int[] answer = new int[question];
        System.out.print("Please enter the answer: ");
        for(int i = 0;i < question; i++)
            answer[i] = scan.nextInt();
        int an = 0, count = 0, total = 0;
        for(int i = 0; i < question; i++){
            System.out.print("Please enter the answer: ");
            an = scan.nextInt();
            total++;
            if(an == answer[i]) {
                System.out.println("Correct!");
                count++;
            }
            else System.out.println("Wrong!The correct answer is " + answer[i]);
            System.out.print("Grade another quiz?(y/n).");
            data = scan.next();
            if(data.compareTo("N") == 0 || data.compareTo("n") == 0)break;
        }
        System.out.println("The number of questions you answered correctly are: " + count);
        System.out.println("Your correct rate is: " + ((double)count / (double)total) * 100.0 + "%");
    }
}
