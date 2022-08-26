package com.inner;

public class Outer {
    int num=8;
    public class Inner{
        public void show(){
            System.out.println(num);/*内部类可以调用外面的成员变量*/
        }
    }
}
