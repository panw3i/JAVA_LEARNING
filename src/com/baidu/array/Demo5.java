package com.baidu.array;

/**
 * Created by pan on 2017/2/2.
 */
public class Demo5 {

    public static void main(String[] args) {


        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);

        System.out.println(i1.equals(i2));

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);
    }
}
