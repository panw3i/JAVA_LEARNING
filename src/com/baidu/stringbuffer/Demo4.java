package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("heima");
        sb.replace(0,3,"bai");//[0,3)表示要替换的区域,"bai"表示替换的内容
        sb.reverse();
        System.out.println(sb);
    }
}
