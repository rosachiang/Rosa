/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day06;


public class MyMath {
    public static double sum( double []nums) {
        int sum=0;
        for(double n:nums){
            sum+=n;
        }
        return sum;
    }
    
    public static double avg(double []nums) 
   {
        double sum=sum(nums);
        double n=nums.length;
        double avg=sum/n;
        return avg;
    }
    
    public static double sd(double []nums) {
        double avg=avg(nums);
        double sumofSquares=0;
        for(double n:nums){
            sumofSquares+=Math.pow(n-avg, 2);
        }
        int n=nums.length;
        double sd=Math.sqrt((1.0/n)*sumofSquares);
        return sd;
    }
    
    public static double cv(double []nums){
        double avg=avg(nums);
        double sd=sd(nums);
        double cv=sd/avg;
        return cv;  
    }
    public static double max(double []nums) {
    
        double max=0;
       for(double n:nums){
           if(n>max){
               max=n;
           }
    } return max;
    }
    
    public static double min(double []nums) {
        double min=Double.MIN_VALUE;
        for(double n:nums){
            if(n<min){
                min=n;
            }
        }return min;
    }
}
