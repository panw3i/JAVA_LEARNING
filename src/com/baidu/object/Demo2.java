package com.baidu.object;

import com.baidu.bean.Student;

/**
 * Created by pan on 2017/1/30.
 */
public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        System.out.println(s1);   // 如果直接打印对象的引用 ,会默认调用toString方法

    }
}
