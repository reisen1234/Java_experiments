package code_data.Six.Second_Program;

public class Compare3 {
    public static Comparable largest(Comparable val1, Comparable val2, Comparable val3){
        Comparable max = val1;
        if(val2.compareTo( max ) > 0)
            max = val2;
        if(val3.compareTo( max ) > 0)
            max = val3;
        return max;
    }
}
