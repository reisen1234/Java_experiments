package code_data.Fourth.First_problem;

import java.util.Scanner;

// ********************************************
//  Bank.java
//
//  A class about basic functionality of bank;
//
// ********************************************
public class Bank {
    public static void main(String[] args) {
        String Name, Number;
        double Saving_number, Withdraw_number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Creat A Bank Account");
        System.out.print("Please Enter Your Account Number :");
        Number = scan.nextLine();
        System.out.print("Please Enter Your Account Name :");
        Name = scan.nextLine();
        _Account person = new _Account(Name, Number);
        System.out.println("User creation succeed.");
        person.Print_Page();
        while (true) {
            char operation = '0';
            operation = scan.next().charAt(0);
            switch (operation) {
                case '1':
                    System.out.print("How much money do you want to save:");
                    Saving_number = scan.nextDouble();
                    person.Saving(Saving_number);
                    break;
                case '2':
                    System.out.print("How much money do you want to Withdraw:");
                    Withdraw_number = scan.nextDouble();
                    person.Withdraw_money(Withdraw_number);
                    break;
                case '3':
                    person.Check_your_account_balance();
                    break;
                case '4':
                    person.Check_your_account();
                    break;
            }
            if (operation == '0') break;
            System.out.print("What more services are needed :");
        }
        System.out.println("Thank you for your using");
    }
}
