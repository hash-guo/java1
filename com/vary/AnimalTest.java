package com.vary;


public class AnimalTest {
    public static void main(String[] args) {
        Animations a=new Animations();
        Animal a1=new Dog();
        a.useAnimal(a1);/*这里传递参数是向上转型(子转父对象类型)，此时父类对象不能访问子类特有方法*/
        a.useDog((Dog)a1);/*若要访问子类特有方法，只能强转类型，此时是向下转型(父转子)*/
    }


}
