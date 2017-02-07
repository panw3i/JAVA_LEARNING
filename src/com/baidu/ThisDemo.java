package com.baidu;

/**
 * Created by pan on 2017/2/7.
 */
public class ThisDemo {

    String name = "Mike";

    public void print(String name){
        System.out.println("类中的属性 name="+this.name);
        System.out.println("局部传参的属性="+name);

    }

    public static void main(String[] args) {
        ThisDemo tt = new ThisDemo();
        tt.print("Orson");
    }
}
