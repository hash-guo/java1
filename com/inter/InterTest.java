package com.inter;

public class InterTest {
    public static void main(String[] args) {
        Inter inter=new InterImpl();/*接口和抽象类一样不能实例化，只能通过接口多态(类似子类多态)来调用方法和参数*/
        inter.method();

    }
}
