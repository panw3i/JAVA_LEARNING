package com.baidu.String;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo8 {

    public static void main(String[] args) {
        String s = "ABCDabcd!@#$%";
        int big = 0;
        int small = 0;
        int num =0;
        int other =0 ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='A' && c<='Z'){
                big++;
            }else if(c>='a' && c<='z'){
                small++;
            }else if(c>='0' && c<='9'){
                num++;
            }else{
                other++;
            }

        }

        System.out.println(
                s+"中大写字母有"+big+"个;小写字母有"+small+"个;数字有"+num+"个;其它有"+other
        );

    }
}
