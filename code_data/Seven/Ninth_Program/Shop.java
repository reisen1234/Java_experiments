package code_data.Seven.Ninth_Program;

// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        ArrayList<Item>cart = new ArrayList<Item>();
        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            item = new Item(itemName,itemPrice,quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
            System.out.println("name\tprice\tquantity\ttotal");
            for(Item iter:cart)
                System.out.println(iter);

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));
        System.out.println("The total price is" + Item.getTotal());
    }
}

