package com.baidu.String;

/**
 * Created by pan on 2017/1/31.
 */
public class Demo2 {
    public static void main(String[] args) {
        byte[] b = new byte[]{97};
        String s2 = new String(b);
        System.out.println(s2);

        // 构造方法传入参数 类型byte[] 进行解码

        byte[] c =  new byte[]{99,100,101,102};
        String s3 = new String(c,2,1);
        System.out.println(s3);

        // 指定起解码数组的起始和长度

        char[] arr3 = {'a','b','c'};
        String s4 = new String(arr3);
        System.out.println(s4);

        // 将字符数组转成字符串

        String s5 = new String(arr3,1,1);
        System.out.println(s5);
    }
}
