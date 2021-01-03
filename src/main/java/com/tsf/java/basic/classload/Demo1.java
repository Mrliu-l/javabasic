package com.tsf.java.basic.classload;

/**
 * 验证类加载机制_准备阶段变量赋值情况
 */
public class Demo1 {

    //普通变量：不会在准备阶段为分配空间&赋值；在创建类对象时初始化
    private int a;

    //静态变量：会在准备极端分配空间&初始化默认值
    private static int b;

    /**
     * 在准备阶段：定义属性constantValue = 1，准备阶段会被初始化为该属性指向的值
     * constantValue：
     *      1.通知虚拟机为静态变量赋值，非静态变量在构造器中赋值；
     *      2.只有同时被final & static修饰的才可以使用该属性
     *      3.局限于基于基本类型和String起作用（因为常量池的作用域就是这些）
     */
    private static final int c = 1;

    //在反编译文件中查看
    public static void main(String[] args) {
        System.out.println("静态变量会在准备阶段赋值为：" + b);
        System.out.println("static final变量会在准备阶段赋值为：" + c);
    }
}
