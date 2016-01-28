package com.company;

/**
 * Created by jredrup on 1/28/2016.
 */
public class Mine {
    public static void main(String[] args) {
        int[] hand = {21, 12, 50, 7, 0};
        System.out.println("Largest value is " + max(hand));
    }


    private static int max(int[] hand){
        int temp = 0;
        for (int i = 0; i < (hand.length - 1); i++){
            if (hand[i] > hand[i + 1] && hand[i] > temp) {
                temp = hand[i];
            }
        }
        return temp;
    }
}
