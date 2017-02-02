package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/2.
 */
public class Demo7 {
    public static void main(String[] args) {
        String s = "heima";
        System.out.println(s);

        change(s);
        System.out.println(s);

        // 基本数据类型的值传递,不改变其值,引用数据类型,改变其值

        // String类型虽然是引用数据类型,但是当作参数传递时和基本数据类型是一样的

        // String 类型一旦赋值无法更改

        // String 作为参数传入的是值的副本

        StringBuffer sb  = new StringBuffer();

//        sb = sb + "bad";   任何数据类型:基本数据类型,引用数据类型 + 字符串  =  字符串类型;
        sb = new StringBuffer(sb+"bad");

        System.out.println(sb+ "9");


    }

    public static void change(String s){
        s += "itcast";
    }

    public static void change(StringBuffer s){
        System.out.println(s);
    }
}
