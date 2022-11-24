package code_data.Eight.Second_Program;

public class SortedIntList extends IntList{
    public SortedIntList(int size) {
        super(size);
    }

    @Override
    public void add(int value) {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else
        {
            int i  = 0;
            for(i = 0; i < numElements; i++){
                if(list[i]>=value)break;
            }
            int tmp, k = value;
            for(int j = i; j <= numElements; j++){
                tmp = list[j];
                list[j] = k;
                k = tmp;
            }
            numElements++;
        }
    }
}
