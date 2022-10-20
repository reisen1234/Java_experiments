package code_data.Fourth.First_problem;
// ********************************************
//  Bank.java
//
//  A class about basic functionality of bank;
//
// ********************************************

public class _Account {
    private double Account_balance;
    private String Account_Name;
    private String Account_Number;
    private double Premium = 10;
    public _Account(String name, String number) {
        Account_balance = 0;
        Account_Name = name;
        Account_Number = number;
    }
    public _Account() {
        Account_balance = 0;
        Account_Name = "";
        Account_Number = "";
    }
    public void Withdraw_money(double Withdraw_num) {
        if(Account_balance < Withdraw_num)
        {
            System.out.println("Insufficient Balance!");
        }
        else if(Account_balance >= Withdraw_num)
        {
            System.out.println("The operation succeed!");
            Account_balance -= Withdraw_num;
        }
        Account_balance -= Premium;
    }
    public void Saving(double saving_num) {
        System.out.println("Saving succeed!");
        Account_balance += saving_num;
    }
    public void Check_your_account_balance() {
        System.out.println("Your Account balance : " + Account_balance);
    }
    public void Check_your_account() {
        System.out.println("Account Name : " + Account_Name);
        System.out.println("Account Number : " + Account_Number);
        System.out.println("Account balance : " + Account_balance);
    }
    public void Print_Page() {
        System.out.println("Welcome to the bank system!");
        System.out.print("Enter '1' is Saving\n" +
                "Enter '2' is Withdraw_monet\n" +
                "Enter '3' is Print balance of account\n" +
                "Enter '4' is Print message of account\n" +
                "Enter '0' is out the system\n" +
                "Witch operation do you want : "  );
    }
}
