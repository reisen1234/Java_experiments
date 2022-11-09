package code_data.Seven.Fifth_Program;

import java.util.Scanner;

// **********************************************************************
//   ShoppingCat_test.java
//
//   A test of shopping cat
// **********************************************************************
public class ShoppingCat_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Y";
        String name;
        ShoppingCart shoppingCart = new ShoppingCart();
        int quantity;
        double price;
        while(answer.compareTo("Y") == 0 || answer.compareTo("y") == 0){
            System.out.print("Please enter the name about the iter: ");
            name = scanner.next();
            System.out.print("Please enter the price about the iter: ");
            price = scanner.nextDouble();
            System.out.print("Please enter the quantity about the iter: ");
            quantity = scanner.nextInt();
            shoppingCart.addToCart(name,price,quantity);
            System.out.print("Try again? (y/n)");
            answer = scanner.next();
        }
        System.out.println(shoppingCart.toString());
    }
}
