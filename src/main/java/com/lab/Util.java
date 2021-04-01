
package com.lab;

import java.util.Random;

public class Util {
    public static int []getAnsArray() {
        Random r=new Random();
         //取得 int []答案陣列   
        int[]ans=new int[4];
        //隨機取一個n值(1-9)
        
        for(int i=0;i<ans.length;){
          int n=r.nextInt(9)+1;  
          boolean exist=isExist(ans,n);
          }
        }
        
    }
    
     
    //判斷n值是否在ans[] int  陣列中
    private  static boolean isExist(int []ans,int n){
      for(int i=0;i<ans.leng)
}
