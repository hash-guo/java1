package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="985";/*这样很容易产生数据安全问题，因为数据太容易被外界访问，故对每个类的成员变量一般都加private(即只在本类中才能使用该变量，其他类只能通过get、set来修改获取)*/
        phone.price=8000;
        System.out.println(phone.brand);
        phone.call();
        System.out.println(phone);/*这里输出new出来的对象在堆内存中的起始位置*/
        /*对于new出来的多个对象，属性可以不同，但方法是公用的*/
        /*成员变量有默认值，而局部变量没有，必须先定义*/
        Student student=new Student("刘洪",19);/*构造方法就是new对象时就会自动调用的方法*/
        /*javaAPI就是事先封装好若干个用于实现某功能的java类，方便用户调用其中的方法*/

        /*自动导包，alt+enter*/
        Scanner scanner=new Scanner(System.in);
        String str="jdk8";
        System.out.println(str.charAt(1));/*charAt方法用来遍历字符串，因为字符串本身就是由字符数组组成的*/

        StringBuilder sb=new StringBuilder();/*创建一个空白的字符串对象，它和String的区别就是它是内容可变的容器*/
        sb.append("hello");/*其添加字符串并返回对象本身，即实现内容可变*/
        sb.append("world");
        System.out.println("sb:"+sb);
        System.out.println(sb.reverse());/*StringBuilder直接实现字符串反转*/
        StringBuilder sb1=new StringBuilder(str);/*String到StringBuilder两者的相互转换，直接构造方法里传入即可*/
        String str1=sb1.toString();/*StringBuilder到String的转换*/
        int i=100;
        String s=String.valueOf(i);/*其他类型转换为String类型的方法*/
        System.out.println(s);
        String s1="100,5,23,26,59";
        String []s2=s1.split(",");/*split方法分开数组元素，参数为对应分隔符*/

//        date对象
        Date date=new Date();/*参数传递毫秒值*/
        System.out.println(date);
        System.out.println(date.getTime());/*返回1970年1月1日到现在的毫秒数*/
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");/*这里M大写是为了和分钟区别*/
        String s3=sim.format(date);/*从date对象到String对象，从String到date就是调用sim的parse方法，作解析*/
        System.out.println(s3);

//        calendar对象,其相比date对象更方便获取单个时间信息
        Calendar cal=Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        System.out.println(year);/*月份记得加一，因为从0开始的*/
        cal.set(2022,10,10);/*set方法可自动设置日期，add方法可调整日期*/
    }
}
