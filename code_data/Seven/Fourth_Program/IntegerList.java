package code_data.Seven.Fourth_Program;
// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//
// ****************************************************************

public class IntegerList
{
    int[] list; //values in the list
    int total_size = 0;
    int now_size = 0;
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        total_size = size;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        now_size = total_size;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i < now_size; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    void addElement(int newVal){
        if(now_size == total_size)
           increaseSize();
        list[now_size++] = newVal;
    }
    public void increaseSize(){
        int[] extended = new int[total_size * 2];
        System.arraycopy(list,0,extended,0,list.length);
        list = extended;
        total_size*=2;
    }
    void removeFirst(int newVal){
        int index = -1;
        for(int i = 0; i < now_size; i++)
            if(list[i] == newVal){
                index = i;
                break;
            }
        if(index != -1){
            now_size--;
            for(int i = index; i < now_size; i++)
                list[i] = list[i + 1];
            System.out.println("Remove succeed!");
        }
        else System.out.println("This element doesn't exist!");
    }
    public void removeAll(int newVal){
        int first = 0, count = 0;
        for(int i = 0; i < now_size; i++){
            if(list[i] == newVal)count++;
            else {
                list[first] = list[i];
                first++;
            }
        }
        now_size-=count;
    }
}
