package code_data.Six.Seventh_Program;
//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*******************************************************

import java.util.Random;

public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static double sum_of_deposit = 0;
    private static int number_of_deposit = 0;
    private static double sum_of_withdraw = 0;
    private static int number_of_withdraw = 0;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner){
        this.balance = initBal;
        this.name = owner;
        Random random = new Random();
        this.acctNum = Math.abs(random.nextLong());
    }
    public Account(String owner){
        this.name = owner;
        this.balance = 0;
        Random random = new Random();
        this.acctNum = Math.abs(random.nextLong());
    }
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
            sum_of_withdraw+=amount;
            number_of_withdraw++;
        }
        else
            System.out.println("Insufficient funds");
    }
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount) {
            balance -= amount + fee;
            sum_of_withdraw+=amount;
            number_of_withdraw++;
        }
        else
            System.out.println("Insufficient funds");
    }
    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount) {
        balance += amount;
        number_of_deposit++;
        sum_of_deposit+=amount;
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    public long getAcctNumber(){
        return acctNum;
    }
    public void printSummary(){
        System.out.println("Account name: " + name);
        System.out.println("Account number: " + acctNum);
        System.out.println("Account balance: " + balance);
    }
    public static int getNumDeposits(){
        return number_of_deposit;
    }
    public static double getSumDeposits(){
        return sum_of_deposit;
    }
    public static int getNumWithdraw(){
        return number_of_withdraw;
    }
    public static double getSumWithdraw(){
        return sum_of_withdraw;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
}
