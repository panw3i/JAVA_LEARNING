package com.baidu.object;

import com.baidu.bean.Student;

/**
 * Created by pan on 2017/1/30.
 */
public class Demo4 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",13);
        Student s2 = new Student("张三",13);

        boolean b = s1.equals(s2);
        System.out.println(b);


    }
}
