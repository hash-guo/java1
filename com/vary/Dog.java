package com.vary;

public class Dog extends Animal {
    @Override
    void eat(){
        System.out.println("狗吃骨头");
    }
    void watchDoor(){
        System.out.println("看门！");
    }
}
