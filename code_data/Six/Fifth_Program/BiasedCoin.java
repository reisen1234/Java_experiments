package code_data.Six.Fifth_Program;

import java.util.Random;

public class BiasedCoin {
    private double bias;
    private int face;
    private final int HEADS = 0;
    private final int TAELS = 1;
    BiasedCoin(){
        this.bias = 0.5;
    }
    BiasedCoin(double bias){
        if(bias > 0.0 && bias <= 1.0){
            this.bias = bias;
        }
        else
            this.bias = 0.5;
        flip();
    }
    public void flip(){
        double tmp;
        Random random = new Random();
        tmp = random.nextDouble(1);
        if(tmp  < bias)
            face = HEADS;
        else
            face = TAELS;
    }
    public boolean Is_head(){
        if (this.face == HEADS)return true;
        else return false;
    }
}
