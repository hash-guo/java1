package com;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();/*ArrayList集合相对于数组其是动态变化的而不是固定大小*/
        array.add("hello");
        array.add("hi");
        array.add("nihao");
        array.add(1,"tgd");/*固定位置添加元素*/
        System.out.println(array);
        array.remove("hi");/*下面依次是移除、修改、获取元素,clear清空所有元素，contains方法判断是否有该元素*/
        array.set(1,"nk");
        System.out.println(array);
        System.out.println(array.get(1));
        System.out.println(array.size());/*得到集合大小*/

//        小案例，遍历学生对象！
        ArrayList<Student> array1=new ArrayList<Student>();
        Student s1=new Student("郭襄",18);
        Student s2=new Student("周林",19);
        Student s3=new Student("李清朋",19);
        Student s4=new Student("李玉",20);
        Student s5=new Student("凉新",21);
        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        array1.add(s4);
        array1.add(s5);
        for (int i=0;i<array1.size();i++){
            Student s=array1.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }

}
