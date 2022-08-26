package com;
//idea中一个项目project包含若干个模块module，一个模块包含若干个包
//快捷键导包alt+enter
import java.util.Random;
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello world");
        Random random=new Random();
        int []a=new int[5]/*动态数组初始化,由系统为数组分配初始值*/;
        for (int i=0;i<5;i++) {
            int r = random.nextInt(10);/*获得随机数*/
            System.out.println(r);
            System.out.println(a[i]);
        }
        System.out.println(a);
        int []a1={55,66,77,88,99};/*静态数组初始化，自己给初始值，由系统确定长度*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1=scanner.nextInt();
        System.out.println("请输入第二个数:");
        int num2=scanner.nextInt();
        isMax(num1,num2);
        System.out.println("第二个版本");
        System.out.println("hot-fix修改的");
        System.out.println("第三个版本");
        System.out.println("hot-fix第二次修改的");
        System.out.println("push-test1");
        System.out.println("push-test2");
        System.out.println("pull-test1");

    }
    public static void isMax(int n1,int n2){
        if (n1 > n2) {
            System.out.println(n1);
        } else if (n1 == n2) {
            System.out.println("两者相同");
        } else {
            System.out.println(n2);
        }
    }
//    方法重载指同一个类中相同方法名但参数类型或其个数不同，此时系统会通过自动匹配参数来调用相应方法
//参数传递基本数据类型，形参变实参不变，而传递引用参数类型(例如数组)，则会实际改变数组内的值
}

