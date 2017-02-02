package com.baidu.array;


public class Demo4 {
    public static void main(String[] args) {



        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer i1 = new Integer("100");
        System.out.println(i1);

//        Integer i2 = new Integer("abc");
//        System.out.println(i2);

        String s2 =  String.valueOf(1);
        System.out.println(s2);

        String s3  = Integer.toString(100);
        System.out.println(s3);

        String s4 = 100 + ""; //推荐使用

        int i = Integer.parseInt("-100");  // 将数字字符串转化为数字
        boolean b = Boolean.parseBoolean("true");


        System.out.println(i);








    }
}
