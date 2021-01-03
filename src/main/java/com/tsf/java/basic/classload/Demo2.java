package com.tsf.java.basic.classload;

/**
 * 验证静态变量的初始化过程(经典面试题)
 */
public class Demo2 {

    private static Demo2 demo2 = new Demo2();

    private static int a;

    //b = 1的值，在初始化之后才会被赋值
    private static int b = 1;


    //通过static变量new的对象时，a与b都没有经过类的init，此时a和b都是准备阶段赋的默认值0
    public Demo2() {
        a++;
        b++;
        System.out.println("a = " + a + "; b = " + b);
    }

    public static void main(String[] args) {
//        Demo2 demo2 = new Demo2();
    }
}
