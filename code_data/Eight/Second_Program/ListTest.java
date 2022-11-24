package code_data.Eight.Second_Program;

// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ****************************************************************
public class ListTest
{
    public static void main(String[] args)
    {
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);
        SortedIntList sortedIntList = new SortedIntList(10);
        sortedIntList.add(100);
        sortedIntList.add(50);
        sortedIntList.add(200);
        sortedIntList.add(25);
        System.out.println(sortedIntList);
    }
}
