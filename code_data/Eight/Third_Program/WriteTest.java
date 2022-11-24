package code_data.Eight.Third_Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WriteTest {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\untitled\\src\\code_data\\Eight\\Third_Program\\testbank";
        Scanner scan = new Scanner(new File(fileName));
        Essay essay = new Essay();
        MultChoice multChoice = new MultChoice();
        int a = scan.nextInt();
        while(a-- != 0){
            String c = scan.next();
            if(c.equals("e")){
                essay.readQuestion(scan);
            }
            else if(c.equals("m")){
                multChoice.readQuestion(scan);
            }
        }
    }
}
