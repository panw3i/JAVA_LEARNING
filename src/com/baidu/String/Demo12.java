package com.baidu.String;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo12 {
    public static void main(String[] args) {
//        test1();
        String s = "  hei ma ";
        String s2 = s.trim();
        System.out.println(s2);
    }

    public static void test1() {
        String s = "heima";
        String s2 = s.replace("a","b");
        System.out.println(s2);

        String s3 = s.replace("c","ff");  // 原字符串不会发生变量
        System.out.println(s3);

        String s4 = s.replace("ei","eo");
        System.out.println(s4);
    }
}
