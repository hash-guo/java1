package com.abstra;

public abstract class Animal {
    abstract void eat();/*抽象类不一定有抽象方法，但抽象方法(无方法体)一定包含在抽象类中*/
    void face(){
        System.out.println("动物长相");
    }
}
