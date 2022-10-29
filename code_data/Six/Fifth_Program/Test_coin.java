package code_data.Six.Fifth_Program;

import java.util.Scanner;

public class Test_coin {
    public static void main(String[] args) {
        BiasedCoin coin1 = new BiasedCoin();
        double bias1,bias2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first bias of coin: ");
        bias1 = scan.nextDouble();
        BiasedCoin coin2 = new BiasedCoin(bias1);
        System.out.print("Please enter the first bias of coin: ");
        bias2 = scan.nextDouble();
        BiasedCoin coin3 = new BiasedCoin(bias2);
        int coin_s1 = 0, coin_s2 = 0, coin_s3 = 0;
        for(int i = 0;i < 100; i++){
            coin1.flip();
            if(coin1.Is_head())coin_s1++;
            coin2.flip();
            if(coin2.Is_head())coin_s2++;
            coin3.flip();
            if(coin3.Is_head())coin_s3++;
        }
        System.out.print("The first coin bias is: " + 0.5 + ". And in one hundred times, Head's bias is: " + (double)coin_s1/100.0
        + "\nThe second coin bias is: " + bias1 + ". And in one hundred times, Head's bias is: " + (double)coin_s2/100.0
        + "\nThe third coin bias is: " + bias2 + ". And in one hundred times, Head's bias is: " + (double)coin_s3/100.0);
    }
}
