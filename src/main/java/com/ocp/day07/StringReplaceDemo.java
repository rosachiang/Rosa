
package com.ocp.day07;


public class StringReplaceDemo {
    public static void main(String[] args) {
        String s1="jbvb";
        String s2="java";
        s1.replace('b', 'a');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        s1=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
                
    }
}
