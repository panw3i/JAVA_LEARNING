package com.baidu.scanner;

import java.util.Scanner;

/**
 * Created by pan on 2017/1/31.
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(i);

        if(sc.hasNextInt()){
            int i  = sc.nextInt();
            System.out.println(i);
        }else{
            System.out.println("类型不匹配");
        }


    }

}

/*
键盘录入类型不一致时
Exception in thread "main" java.util.InputMismatchException
 */