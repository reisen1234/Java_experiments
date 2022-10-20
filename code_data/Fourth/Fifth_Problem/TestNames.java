package code_data.Fourth.Fifth_Problem;
// ********************************************
//  TestNames.java
//
//  A class for test Name;
//
// ********************************************
import java.util.*;
public class TestNames {
    public static void main(String[] args){
        String first_name,middle_name,final_name;
        Name first,second;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first data");
        System.out.print("Please enter the first_name: ");
        first_name = scan.nextLine();
        System.out.print("Please enter the middle_name: ");
        middle_name = scan.nextLine();
        System.out.print("Please enter the final_name: ");
        final_name = scan.nextLine();
        first = new Name(first_name,middle_name,final_name);
        System.out.println("Please enter the second data");
        System.out.print("Please enter the first_name: ");
        first_name = scan.nextLine();
        System.out.print("Please enter the middle_name: ");
        middle_name = scan.nextLine();
        System.out.print("Please enter the final_name: ");
        final_name = scan.nextLine();
        second = new Name(first_name,middle_name,final_name);
        System.out.println("The first data of firstMiddleLast is " + first.firstMiddleLast());
        System.out.println("The first data of lastFirstMiddle is " + first.lastFirstMiddle());
        System.out.println("The first data of lastFirstMiddle is " + first.lastFirstMiddle());
        System.out.println("The first data of majuscule is " + first.initials());
        System.out.println("The first data of length is " + first.length());
        System.out.println("The second data of firstMiddleLast is " + second.firstMiddleLast());
        System.out.println("The second data of lastFirstMiddle is " + second.lastFirstMiddle());
        System.out.println("The second data of lastFirstMiddle is " + second.lastFirstMiddle());
        System.out.println("The second data of majuscule is " + second.initials());
        System.out.println("The second data of length is " + second.length());
        if(first.equals(second))
        {
            System.out.println("Two Name is same.");
        }
        else
            System.out.println("Two Name is different.");
    }
}
