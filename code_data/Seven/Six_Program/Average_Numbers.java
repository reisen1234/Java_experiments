package code_data.Seven.Six_Program;

public class Average_Numbers {
    public static void main(String[] args) {
        double avg = 0;
        for(String number:args){
            avg += (double)Integer.parseInt(number);
        }
        System.out.println("The average is " + avg / (double)args.length);
    }
}
