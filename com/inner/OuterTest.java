package com.inner;

public class OuterTest {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();/*通过此方法调用内部类，作为外部类成变的方式*/
        inner.show();/*还有局部内部类(即在方法内定义类，此时需在方法内创建该类对象才能调用)*/
    }
}
