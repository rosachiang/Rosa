
package com.ocp.day07;


public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("吃葡萄吐葡萄");
        sb.append("皮");
        System.out.println(sb);
        sb.insert(3, "不");
        System.out.println(sb);
        sb.replace(1,2,"蒲");
        System.out.println(sb);
        //吐葡萄
        sb.delete(0, 4);
        System.out.println(sb);
        sb.delete(3, sb.length());
        System.out.println(sb);
   
    }
}