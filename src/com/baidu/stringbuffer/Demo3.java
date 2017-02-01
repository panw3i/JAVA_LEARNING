package com.baidu.stringbuffer;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        sb.deleteCharAt(0);  // 删除指定位置
        sb.delete(1,2); // 新的字符串,新的索引位置
        sb.delete(0,sb.length()); //清空缓存
        System.out.println(sb);

    }

}
