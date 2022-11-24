package code_data.Eight.Third_Program;

import java.util.Scanner;

public class Essay extends TestQuestion{
    protected int line;
    protected Essay(){
        super();
    }
    @Override
    protected void readQuestion(Scanner scanner) {
        line = scanner.nextInt();
        scanner.nextLine();
        Problem = scanner.nextLine();
        System.out.println(Problem);
        for(int i = 0; i < line; i++)System.out.println();
    }

}
