
package com.ocp.day01;


public class Account {
 int balance;// 帳戶餘額    
 void withdraw(int money ){ //提款方法
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
