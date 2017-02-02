package com.baidu.array;

/**
 * Created by pan on 2017/2/2.
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr  = {11,22,44,33,55};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int  tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i]  = tmp;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
