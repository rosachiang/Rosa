
package com.ocp.day8;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        double[][]m={{100,90,80} , {70,60,50}};
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m);
        
        int sum=0;
        for(double[]x:m){
            for(double y:x){
                sum+=y;
               
            }
        } System.out.println(sum);
   
    }
}
