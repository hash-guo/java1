package com.cases;

public class Fanxing<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public<T> void show(T t){/*泛型方法定义*/
        System.out.println(t);
    }
}
