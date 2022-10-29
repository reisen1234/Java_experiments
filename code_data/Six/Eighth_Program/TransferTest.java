package code_data.Six.Eighth_Program;

import java.util.Scanner;

//*******************************************************
// TestAccount.java
//
// A simple driver to test the overloaded methods of
// the Account class.
//*******************************************************
public class TransferTest {
    public static void main(String[] args) {
        Account account1 = new Account(1000,"ReiSen");
        Account account2 = new Account(1000,"Nahida");
        String again = "y";
        double money;
        String answer = "0";
        Scanner scanner = new Scanner(System.in);
        while(again.compareTo("Y") == 0 || again.compareTo("y") == 0){
            System.out.println("Which operation do you want?\n" +
                    "1.Transfer money from acct1 to acct2\n" +
                    "2.Transfer money from acct2 to acct1");
            answer = scanner.next();
            if(answer.compareTo("1") == 0){
                System.out.print("How much do you want to transfer: ");
                money = scanner.nextDouble();
                Account.transfer(account1,account2,money);
            }
            else if(answer.compareTo("2") == 0){
                System.out.print("How much do you want to transfer: ");
                money = scanner.nextDouble();
                Account.transfer(account2,account1,money);
            }
            else
                System.out.println("Wrong input!");
            System.out.println("account1:" + account1);
            System.out.println("account2:" + account2);
            System.out.println("More transactions? (y/n)");
            again = scanner.next();
        }
    }
}
