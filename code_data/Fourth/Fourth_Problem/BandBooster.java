package code_data.Fourth.Fourth_Problem;
// ********************************************
//  BandBooster.java
//
//  A class about basic functionality of BandBooster;
//
// ********************************************
public class BandBooster {
    private String Supporter_Name;
    private int boxesSold;
    public BandBooster(String name){
        Supporter_Name = name;
        boxesSold = 0;
    }
    public String getName(){
        return Supporter_Name;
    }
    public void updateSales(int sold){
        boxesSold += sold;
    }
    public String toString(){
        String data = "";
        data += Supporter_Name + " : " + boxesSold + " boxes";
        return data;
    }
}
