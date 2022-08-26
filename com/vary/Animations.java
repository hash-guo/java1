package com.vary;

public class Animations {/*这里一个专门的类演示动物的食性，利用多态可以很方便动物种类的扩展，不用一个个写*/
    public void useAnimal(Animal a){
        a.eat();
    }
    public void useDog(Dog d){
        d.watchDoor();
    }
}
