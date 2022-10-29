package code_data.Six.Sixth_Program;

//***********************************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.
//***********************************************************
import java.util.Scanner;
public class TestAccounts1
{
    public static void main(String[] args)
    {
        Account testAcct;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for (int i=1; i<=num; i++)
        {
            testAcct = new Account(100, "Name" + i);
            System.out.println("\nCreated account " + testAcct);
            System.out.println("Now there are " + Account.numAccounts() +
                    " accounts");
        }
        String name;
        System.out.print("Please enter the first name: ");
        name = scan.next();
        Account account1 = new Account(100,name);
        System.out.print("Please enter the second name: ");
        name = scan.next();
        Account account2 = new Account(100,name);
        System.out.print("Please enter the third name: ");
        name = scan.next();
        Account account3 = new Account(100,name);
        System.out.println("Before merge account1 is:\n" + account1);
        System.out.println("account2 is:\n" + account2);
        System.out.println("account3 is:\n" + account3);
        account1.close();
        Account new_account =  account2.consolidate(account2,account3);
        System.out.println("After merge, Account1 is\n " + account1);
        System.out.println("account2 is:\n" + account2);
        System.out.println("account3 is:\n" + account3);
        System.out.println("New Account is: " + new_account);
    }
}

