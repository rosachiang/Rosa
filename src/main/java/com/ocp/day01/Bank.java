
package com.ocp.day01;
public class Bank {
      public static void main(String[] args) {
        Account a01=new Account();//建立物件
        Account a02=new Account();
        Account a03=new Account();
        //當成各帳戶第一次的存款
        a01.deposit(1000);
        a02.deposit(2000);
        a03.deposit(3000);
        
          System.out.printf("a01帳戶餘額: $%,d\n",a01.getBalance());
          System.out.printf("a02帳戶餘額: $%,d\n",a02.getBalance());
          System.out.printf("a03帳戶餘額: $%,d\n",a03.getBalance());
          
          //deposit
          System.out.println("存款後...");
          a01.deposit(500);
          System.out.printf("a01 帳戶餘額: $%d\n", a01.getBalance());
          a02.withdraw(800);
          System.out.printf("a02 帳戶餘額: $%d,\n", a02.getBalance());
          //存款
          System.out.println("a03 存款-1200 元後....");
          a03.deposit(-1200);
          System.out.printf("a03 帳戶餘額:$%,d\n", a03.getBalance());
          a03.withdraw(5000);
          System.out.printf("a03 帳戶餘額:$%,d\n", a03.getBalance());
          
          
    }     
           
}
