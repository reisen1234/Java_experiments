package code_data.Fourth.Fifth_Problem;
// ********************************************
//  Name.java
//
//  A class about basic functionality of name input;
//
// ********************************************
public class Name {
    private String First_Name;
    private String Middle_Name;
    private String Final_Name;
    public Name(String first, String middle, String last){
        First_Name = first;
        Middle_Name = middle;
        Final_Name = last;
    }
    public String getFirst(){
        return First_Name;
    }
    public String getMiddle(){
        return Middle_Name;
    }
    public String getLast(){
        return Final_Name;
    }
    public String firstMiddleLast(){
        String data = "";
        data += First_Name + " " + Middle_Name + " " + Final_Name;
        return data;
    }
    public String lastFirstMiddle(){
        String data = "";
        data += Final_Name + ", " + First_Name + " " + Middle_Name;
        return data;
    }
    public boolean equals(Name otherName){
        if(otherName.First_Name.equalsIgnoreCase(First_Name)&&otherName.Middle_Name.equalsIgnoreCase(Middle_Name)&&otherName.Final_Name.equalsIgnoreCase(Final_Name)){
            return true;
        }
        else return false;
    }
    public String initials(){
        String data = "";
        data += First_Name.substring(0,1).toUpperCase() + Middle_Name.substring(0,1).toUpperCase() + Final_Name.substring(0,1).toUpperCase();
        return data;
    }
    public int length(){
        return First_Name.length() + Middle_Name.length() + Final_Name.length();
    }
}
