
package com.ocp.day07;

public class StringEquals {
    public static void main(String[] args) {
        String s1=new String("JAVA");
        String s2=new String("JAVA");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3="java";
        String s4="java";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
 
}
