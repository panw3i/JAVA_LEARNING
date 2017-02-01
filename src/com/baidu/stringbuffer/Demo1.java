package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer();
        System.out.println(sb.length()); // 0  容器中的字符数

        System.out.println(sb.capacity()); //16

        StringBuffer sb1 = new StringBuffer(10);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


        StringBuffer sb2 = new StringBuffer("heima");
        System.out.println(sb2.length());//5
        System.out.println(sb.capacity()); //21



    }
}
