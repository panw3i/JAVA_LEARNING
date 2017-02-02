package com.baidu.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by pan on 2017/2/2.
 */

public class Demo2 {
    public static void main(String[] args) {
        int[] arr  = {33,22,11,44,66,55};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,1)); // -1
        System.out.println(Arrays.binarySearch(arr,33)); // -4


    }
}
