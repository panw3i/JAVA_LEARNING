package com.baidu.String;

/**
 * Created by pan on 2017/1/31.
 */
public class Demo3 {
    public static void main(String[] args) {
        String s1 = "heima";
        String s2 = "heima";
        String s3 = "HeiMa";
        String s4 = "";
        String s5 = " ";  // 空白也是对象
        String s6 = null; // null 无法调用任何方法, 否则是空指针异常,null 常量可以给做任意的引用数据类型赋值



        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("--------");

        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("---------");

        System.out.println(s1.contains(s3));

        System.out.println("----------");

        System.out.println(s1.startsWith("h"));

        System.out.println("------------");

        System.out.println(s1.endsWith("m"));

        System.out.println("------------");

        System.out.println(s4.isEmpty());
        System.out.println(s5.isEmpty());
//        System.out.println(s6.isEmpty());   //Exception in thread "main" java.lang.NullPointerException







    }
}
