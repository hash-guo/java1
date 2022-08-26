package com.succession;

public class Fu {
    protected int age;
    public void show(){
        System.out.println("我是父类");
    }

    public Fu(int age) {
        this.age = age;
    }
    public Fu(){
        System.out.println("我是父，我在初始化！");
    }
}
