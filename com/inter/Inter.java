package com.inter;

public interface Inter {
    int a=10;/*接口中的变量默认是共享常量*/
    public abstract void method();/*接口中的方法默认是抽象方法，即接口就是特殊的抽象类*/
}
