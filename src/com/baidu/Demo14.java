package com.baidu;

/**
 * Created by pan on 2017/2/1.
 */
public class Demo14 {

    public static void main(String[] args) {
        // 大串
        String max = "aaaagdsasgdgsdgdgaggssfsfasfdgasg";

        // 小串
        String min = "as";

        // 计数器
        int count = 0;

        // 初始的index

        int index = 0;


        while (index!=-1){
            index = max.indexOf(min,index);
            max = max.substring(index+min.length());
            count++;
            System.out.println(count);
        }


//        while ((index = max.indexOf(min))!=-1){
//            count++;
//            max = max.substring(index+min.length());
//        }
//
//           System.out.println(count);
//
        // index的值随max的值的变化而变化

        // while 循环时面依次截取掉前面计算的结果 得到 新的字符串,直到没有为止




    }
}
