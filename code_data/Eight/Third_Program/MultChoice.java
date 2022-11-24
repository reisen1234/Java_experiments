package code_data.Eight.Third_Program;

import java.util.Scanner;

public class MultChoice extends TestQuestion{
    protected MultChoice(){
        super();
    }
    @Override
    protected void readQuestion(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();
        Problem = scanner.nextLine();
        System.out.println(Problem);
        for(int i = 1; i <= n; i++)
            System.out.println(i + ": " + scanner.nextLine());
    }
}
