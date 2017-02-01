package com.baidu.String;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo9 {
    public static void main(String[] args) {
//        test();
//        demo2();
        char[] arr = {'a','b','c'};
        String s = String.valueOf(arr);  // 底层是由String类的构造方法完成的
        System.out.println(s);

        String s2 = String.valueOf(100);
        System.out.println(s2+100);  // 其它对象与字符相加得到字符串
    }

    public static void demo2() {
        String s = "heima";
        char[] arr = s.toCharArray();
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void test() {
        String s1 = "abc";
        String s2 =  "你好";
        byte[] arr = s1.getBytes();
        byte[] arr2 = s2.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
    }
}
