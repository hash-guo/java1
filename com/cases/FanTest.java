package com.cases;

public class FanTest {
    public static void main(String[] args) {
        Fanxing<String> fan=new Fanxing<String>();/*泛型的应用，有点类似抽象，它将普通类型作为参数传递(这里传递的都是封装类)，用<>表示*/
        fan.setT("hello");
        System.out.println(fan.getT());
        fan.show(250);
        System.out.println(sum(5,6,7));
    }
    public static int sum(int... a){/*可变参数的使用*/
        int sum=0;
        for(int i : a){
            sum+=i;
        }
        return sum;
    }
}
