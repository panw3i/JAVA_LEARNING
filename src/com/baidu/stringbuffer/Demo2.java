package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        sb.append(1);
        sb.append(1.3);
        sb.append(sb);
        sb.insert(3,"heima");  // 从第3个索引开始
        System.out.println(sb);  // StringBuffer的方法操作的是同一对象

    }
}
