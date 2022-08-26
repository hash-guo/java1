package com;

import com.succession.Fu;/*不同包下要先导包*/

public class Zi extends Fu {
    static int  age;/*类中方法或变量加static代表被该类所有对象所共享，如果赋值则代表该值可以一直共享使用*/
    final String name="郭襄";/*final修饰的代表最终态，修饰类、方法、变量、引用类型(例如类)分别代表该类不能继承、方法不能重写、变量为常量、类的地址不能变，但其内容可以变*/

    public void show(){/*这里重写了父类的方法，还可以添加自己的功能*/
        System.out.println(super.age);/*super代表调用父类对象，this指向当前对象，即本类*/
        super.show();/*注意子类方法重写时，父类的私有方法不能被重写，并且重写时，子类对应方法的修饰符权限等级只能更高，不能更低*/
    }

    public Zi() {/*子类创建对象时，因为是继承父类，故初始化时，触动父类也调用无参构造，若父类没有无参构造，则子类无参、带参方法中都要添加super(),默认自创建父类无参构造*/
        System.out.println("我是子，我在初始化");
    }

    public Zi(int age) {
        this.age = age;
    }
}
