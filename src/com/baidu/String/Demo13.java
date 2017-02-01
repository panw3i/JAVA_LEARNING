package com.baidu.String;

import java.util.Scanner;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo13 {
    public static void main(String[] args) {
//        test1();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符:");
        String line = sc.nextLine();

        String s = "";
        char[] arr = line.toCharArray();

        for (int i = arr.length-1; i>=0; i--) {
            s = s +arr[i];
        }

        System.out.println(s);


    }

    public static void test1() {
        String s = "abc";
        char[] arr = {'1','2','3'};
        System.out.println(arr);
        for (int i = 0; i < s.length(); i++) {
            arr = s.toCharArray();
//            char last = arr[arr.length-1-i];
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(String.valueOf(arr));
    }
}
