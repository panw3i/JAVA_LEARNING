package com.baidu.String;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo11 {
    public static void main(String[] args) {
//        test1();

        int[]  arr = {1,2,3};
        String s = "[";  // 初始第一位
        for (int i = 0; i <arr.length; i++) {
                if (i == arr.length-1){  //表示最后一位
                    s = s + arr[i]+"]";
                }else{
                    s = s+arr[i]+",";
                }
        }

        System.out.println(s);
    }

    public static void test1() {
        int[] arr = {1,2,3};
        String s = "";
        for (int i = 1; i < arr.length; i++) {
            s+=(","+arr[i]);
        }
        System.out.println("{"+arr[0]+s+"}");
    }
}
