package com.ocp.day06;
import java.util.Arrays;
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[]scores= new int[3];
        scores[0]=100;
        scores[1]=90;
        scores[2]=90;
        int lens=scores.length;
        System.out.printf("陣列長度: %d\n",lens);
        System.out.println(Arrays.toString(scores));
        int sum=scores[0]+scores[1]+scores[2];
        double avg= (double)sum/lens;
        System.out.printf("總分: %d 平均: %.1f\n",sum ,avg);
    }
    
}
