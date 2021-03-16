
package com.ocp.day01;


public class Account {
 private int balance;// 帳戶餘額  
       //自行撰寫一個帳戶餘額方式
        int getBalance(){
            return balance; // 方法停止並回傳餘額
        }
       
       
 void withdraw(int money ){ //提款方法
     //提款方法
     if(money<=0){
         System.out.println("提款金額有誤!");
         return; //提款到此結束
     }
     if(money>balance){
         System.out.println("帳戶餘額不足");
         return;
     }
     balance-= money;
    }
 
 void deposit(int money){ //存款方法
     //VERTIFY MONEY COULDN'T BE -
     if(money <=0){
         System.out.println("存款金額不符!");
         return;//方法到此結束!
     }
     balance+=money;
 }
}
