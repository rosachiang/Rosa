
package com.ocp.day06;
import java.util.Arrays;
public class ArrayDemo2 {
    public static void main(String[] args) {
            int[]scores={100,90,90,80,70,50,40,100,75,15};
            System.out.printf("%s ,長度: %d\n", Arrays.toString(scores),scores.length);
            //總分
            int sum=0;
            for(int a=0;a<scores.length;a++){
                sum+=scores[a];
                
            }System.out.println(sum);
            //平均

            double avg=(double)sum/scores.length;
             System.out.printf("總分: %d 平均: %.1f\n",sum,avg);
            //求最高分
            
            int max=50;
            for(int a=0;a<scores.length;a++){
                if(max<scores[a]){
                    max=scores[a];
                    
                }
                    
            }System.out.println("最高分為:"+max);
            
           int min=max;
            for(int a=0;a<scores.length;a++){
                if(min>scores[a]){
                    min=scores[a];
                    
                }
                System.out.printf("最低分: %d\n",min);
           
            
            
    }
    
}
