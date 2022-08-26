package com.succession;

import com.Zi;

public class Zhu {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.show();/*子类调用方法，先在自己里面找，再去父类(子父类方法相同也是这样)*/
    }
}
