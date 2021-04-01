
package com.ocp.day04;
import com.ocp.day04.Bar.Money;


public class AccessMoney {
    public static void main(String[] args) {
        Money m1=new Money();
        System.out.println(m1.amount);
        com.ocp.day04.Foo.Money m2= new com.ocp.day04.Foo.Money();
        System.out.println(m2.amount);
        System.out.println(m1.amount+m2.amount);
    }
}
