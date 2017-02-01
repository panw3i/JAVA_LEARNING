package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo5 {
    public static void main(String[] args) {
        String sb = new String("heima");
        String s = sb.substring(0,3);
        System.out.println(sb);  // 截取时,对象自身没有发生变化
        System.out.println(s);
    }
}
