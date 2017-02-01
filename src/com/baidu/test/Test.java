package com.baidu.test;

import java.util.Scanner;

/**
 * Created by pan on 2017/2/1.
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < 3; i++) {


            System.out.println("请输入用户名");
            String userName = sc.nextLine();
            System.out.println("请输入密码");
            String passwd = sc.nextLine();

            if ("admin".equals(userName) && "admin".equals(passwd)){

                System.out.println("您已登入");
                break;
            } else{
                if (i == 2){
                    System.out.println("次数已到");
                }
                System.out.println("密码错误,请重新输入!还有"+(2-i)+"次机会");
            }




        }

    }
}
