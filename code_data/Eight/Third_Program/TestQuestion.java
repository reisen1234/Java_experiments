package code_data.Eight.Third_Program;

import java.util.Scanner;

public abstract class TestQuestion {
    protected String Problem;
    protected abstract void readQuestion(Scanner scanner);
    protected TestQuestion(){
        this.Problem = "";
    }
}
