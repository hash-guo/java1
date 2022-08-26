package com.abstra;

public class Cat extends Animal {
    void eat(){/*抽象类的子类你不重写父类所有抽象方法的话，你自己也要是抽象类才行*/
        System.out.println("猫吃鱼");
    }
}
