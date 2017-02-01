package com.baidu.String;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo10 {
    public static void main(String[] args) {

        String s1=  "aabcasfasdf";
        String s2 = s1.substring(1,2).toUpperCase().concat(s1.substring(2).toLowerCase());

        System.out.println(s2);

    }


}
