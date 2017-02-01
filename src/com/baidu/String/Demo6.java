package com.baidu.String;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr  = {11,22,33,44};
        System.out.println(arr.length);


        String s1 = "heima";
        System.out.println(s1.length());

        String s2 = "你好吗?";
        System.out.println(s2.length());//length 每个字符的个数


        char c = s2.charAt(3);
        System.out.println(c);

        System.out.println(s2.indexOf('0'));  // -1
        System.out.println(s2.indexOf('?'));  // 返回索引值
        System.out.println(s2.indexOf('?'));  // 返回索引值


        System.out.println(s2.indexOf("ia"));
        System.out.println(s1.indexOf("im"));

        System.out.println(s1.indexOf("a",3));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("a"));

        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,3));  // 关系[)

        String s = "woaibeijing";
        s.substring(4);      // 产生一个新的字符串对象,原字符串对象不发生改变
        System.out.println(s);

    }
}
