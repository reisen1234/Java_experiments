package code_data.Six.Fourth_Program;
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
    public Account(double initBal,String owner, long number)
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


    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
}
