package code_data.Fourth.Fourth_Problem;
// ********************************************
//  Supporter.java
//
//  A class about basic functionality of input_supporter;
//
// ********************************************
import java.util.*;
public class Supporter {
    public static void main(String[] args){
        String name1,name2;
        int sold;
        BandBooster supporter1,supporter2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the supporter_name of first band : ");
        name1 = scan.nextLine();
        supporter1 = new BandBooster(name1);
        System.out.print("Please enter the supporter_name of second band : ");
        name2 = scan.nextLine();
        supporter2 = new BandBooster(name2);
        for(int i = 0;i < 3;i++) {
            System.out.print("Enter the number of boxes sold by "+ supporter1.getName() +" this week : ");
            sold = scan.nextInt();
            supporter1.updateSales(sold);
            System.out.print("Enter the number of boxes sold by "+ supporter2.getName() +" this week : ");
            sold = scan.nextInt();
            supporter2.updateSales(sold);
        }
        System.out.println(supporter1.toString());
        System.out.println(supporter2.toString());
    }
}
