package code_data.Six.Ninth_Program;

import java.util.Random;

public class RandomWalk {
    private int x = 0;
    private int y = 0;
    private int sum_of_step = 0;
    private int max_step;
    private int boundary;
    private int direction = 0;
    RandomWalk (int max, int edge){
        this.boundary = max;
        this.max_step = edge;
        this.x = 0;
        this.y = 0;
    }
    RandomWalk (int max, int edge, int startX, int startY) {
        this.boundary = max;
        this.max_step = edge;
        this.x = startX;
        this.y = startY;
    }
    public String toString(){
        return "Steps: " + sum_of_step + "; Position: (" + x + "," + y + ")。";
    }
    public void takeStep(){
        Random random = new Random();
        this.direction = random.nextInt(4);
    }
    public boolean moreSteps(int step){
        if(sum_of_step + step > this.max_step){
            return false;
        }
        else
            return true;
    }

    public int getMax_step() {
        return max_step;
    }

    public boolean inBounds(int step){
        switch (this.direction){
            case 0:
                y-=step;
                break;
            case 1:
                y+=step;
                break;
            case 2:
                x-=step;
                break;
            case 3:
                x+=step;
                break;
        }
        if(x<-boundary||x>boundary||y<-boundary||y>boundary) {
            sum_of_step += step;
            return false;
        }
        else {
            sum_of_step += step;
            return true;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void walk() {
        Random random = new Random();
        while (true) {
            takeStep();
            int step = Math.abs(random.nextInt(11));
            if (moreSteps(step) == true) {
                if (inBounds(step) == false)
                    break;
                else
                    System.out.println(toString());
            }
        }
        System.out.println(toString());
    }
}
