package code_data.Fifth.Third_Problem;
// ***************************************************************
// Balance_message.java
//
//
// Bills the monthly billing account of a credit card
// company customer named CS CARD International
// ***************************************************************
import java.text.NumberFormat;
import java.util.*;
public class Balance_message {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.CHINA);
        double New_Balance = 0.0, Previous_Balance = 0.0, Additional_Charges = 0.0, interest = 0.0, Minimum_Payment = 0.0;
        System.out.print("Please enter Previous balance: ");
        Previous_Balance = scan.nextDouble();
        System.out.print("Please enter additional balance: ");
        Additional_Charges = scan.nextDouble();
        if(Previous_Balance == 0.0)
            interest = 0.0;
        else
            interest = (Previous_Balance + Additional_Charges) * 0.02;
        New_Balance = Previous_Balance + Additional_Charges + interest;
        if(New_Balance < 50.0)
            Minimum_Payment = New_Balance;
        else if(New_Balance >= 50.0 && New_Balance <= 300.0)
            Minimum_Payment = 50.0;
        else
            Minimum_Payment = New_Balance * 0.2;
        System.out.println("CS CARD International Statement \n" +
                "=============================== \n" +
                "Previous Balance:      " + money.format(Previous_Balance) +
                "\nAdditional Charges:     " + money.format(Additional_Charges) +
                "\nInterest:              " + money.format(interest) +
                "\nNew Balance:          " + money.format(New_Balance) +
                "\nMinimum Payment:     " + money.format(Minimum_Payment));
    }
}
