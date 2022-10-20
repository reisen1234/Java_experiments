package code_data.Fourth.Second_Problem;
//Chapter4:WritingClasses
// *******************************************************
// First_Account.java
//
// A bank account class with methods
// change the name on, charge a fee
// *******************************************************
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    //----------------------------------------------
//Constructor -- initializes balance, //----------------------------------------------
    public Account(double initBal, String owner, long number){
        balance = initBal;
        name = owner;
        acctNum = number;
    }


    //----------------------------------------------
// Checks to see if balance is sufficient // If so, decrements balance by amount; //----------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient");
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
        String data = "";
        data  += "Account Name is " + name +
                "\n"+ name + " number is " + acctNum +
                "\n" + name + " balance is " + balance + "\n";
        return data;
    }
    //----------------------------------------------
// Deducts $10 service fee
//----------------------------------------------
    public double chargeFee()
    {
        balance-=10;
        System.out.println("Service fee deduction is successful!\nNow balance of " + name + "'s account is " + balance);
        return balance;
    }
    //----------------------------------------------
// Changes the name on the account
//----------------------------------------------
    public void changeName(String newName)
    {
        name = newName;
    }
}


