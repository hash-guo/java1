package com.inter;

public class InterImpl implements Inter {/*一个类可以实现多个接口*/
    /*若一个类中没有父类则默认继承Object根类*/
    @Override
    public void method() {
        System.out.println("我是用来实现接口inter的");
    }
    /*接口和抽象类的区别，接口是对行为的抽象，抽象类是对事物的抽象*/
}
