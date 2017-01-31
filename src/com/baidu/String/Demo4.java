package com.baidu.String;

/**
 * Created by pan on 2017/1/31.
 */
public class Demo4 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";   // 字面量属于常量
        System.out.println(s1  == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("abc");  // 创建了两个对象 一个在常量池里,一个在堆内存上
        String s4 = new String("abc");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 == s4);


        String s5 = "a"+"b"+"c";
        String s6 = "abc";
        System.out.println(s5 ==  s6); // true java常量优化机制:如果常量池里有,就不用重新创建


        String s7 = "a"+"b";
        String s8 = s7+"c";
        System.out.println(s8 == s6);
        System.out.println(s8.equals(s6));
    }
}
