package com.baidu.String;

/**
 * Created by pan on 2017/1/31.
 */
public class Demo1 {
    public static void main(String[] args) {

        String str = "abc";  //"abc"可以看成是一个字符串对象

        str = "def";  // 等于 断开了str指向"abc",重新指向"def","abc"成为垃圾


        System.out.println(str);  // 重写了toString()方法
        System.out.println(str.toString());
    }
}
