package com.anony;

public class EatingTest {
    public static void main(String[] args) {
        EatingOper e=new EatingOper();
        e.method(new Eating() {/*匿名内部类的使用，直接内部重写，就不用一个个新建实现类*/
            @Override
            public void eat() {
                System.out.println("狗吃骨头！");
            }
        });
        System.out.println("开始");
        System.currentTimeMillis();/*返回当前时间据1970的毫秒数*/
        System.exit(0);/*System类，这个方法表示终止虚拟机*/
        System.out.println("结束");
    }
}
