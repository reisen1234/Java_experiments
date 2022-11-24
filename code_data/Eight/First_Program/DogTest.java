package code_data.Eight.First_Program;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Labrador labrador = new Labrador("labrador","Red");
        Yorkshire yorkshire = new Yorkshire("yorkshire");
        System.out.println(labrador.getName() + " says " + labrador.speak());
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
    }
}
