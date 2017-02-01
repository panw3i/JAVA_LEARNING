package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo6 {
    public static void main(String[] args) {
//        test1();

        StringBuffer sb = new StringBuffer("heima");
        String s1 =new String(sb);
        System.out.println(s1);

        String s3 = sb.substring(0,sb.length());
    }

    public static void test1() {
        StringBuffer sb1 = new StringBuffer("heima");  //通过构造方法转换为StringBuffer对象
        System.out.println(sb1);

        StringBuffer sb2  = new StringBuffer();
        sb2.append("heima");
        System.out.println(sb2);
    }
}
