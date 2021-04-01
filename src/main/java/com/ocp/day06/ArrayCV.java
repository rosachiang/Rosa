
package com.ocp.day06;


public class ArrayCV {
    public static void main(String[] args) {
        double[]nums={10,20,30};
        double sum=0;
        for(double n:nums){
            sum+=n;
        }
        System.out.printf("sum: %.1f\n",sum);
        
        double avg=sum/nums.length;
        System.out.printf("avg: %.1f\n", avg);
        //求標準差SD
        
        double sumofSquares=0;
        for(double n:nums){
            sumofSquares += Math.pow(n-avg,2);
        }
        System.out.printf("Sum of Squares: %.1f\n",sumofSquares);
        double sd=Math.sqrt((1.0/nums.length)*sumofSquares);
        System.out.printf("S.D: %.1f\n", sd);
        //cv
        double cv=sd/avg;
        System.out.printf("cv : %.1f\n",cv);
        
    }
}
