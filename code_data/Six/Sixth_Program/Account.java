package code_data.Six.Sixth_Program;
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
    public static int numAccounts = 0;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner){
        this.balance = initBal;
        this.name = owner;
        Random random = new Random();
        this.acctNum = Math.abs(random.nextLong());
        numAccounts++;
    }
    public Account(String owner){
        this.name = owner;
        this.balance = 0;
        Random random = new Random();
        this.acctNum = Math.abs(random.nextLong());
        numAccounts++;
    }
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount)
            balance -= amount + fee;
        else
            System.out.println("Insufficient funds");
    }
    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    public static int numAccounts(){
        return numAccounts;
    }
    public void close(){
        this.name = "CLOSED";
        this.balance = 0;
        numAccounts--;
    }
    public Account consolidate(Account acct1, Account acct2){
        Account new_account = null;
        if(acct1.name.compareTo(acct2.name) == 0 && acct1.acctNum != acct2.acctNum) {
           new_account = new Account(acct1.balance+acct2.balance, acct1.name);
           acct1.close();
           acct2.close();
           return new_account;
        }
        else
            return null;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
}
