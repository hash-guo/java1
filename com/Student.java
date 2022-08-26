package com;

import java.util.Objects;

public class Student implements Comparable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {/*此时就保护了数据的隐私，因为可以加判断*/
        if (age<0||age>130){
            System.out.println("您输入的年龄有误...请重新输入");
        }else{
            this.age = age;/*this指向当前调用方法的对象*/
        }
    }

    @Override/*之所以要重写toString方法，是因为使对象的字符串形式表达简明清晰*/
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {/*重写此方法，此时就可以判断new的两个对象内容是否相同*/
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Object o) {
        Student stu=(Student)o;
        int num=this.age-stu.age;
        int num1=num==0?this.name.compareTo(stu.name):num;/*这里能调用compareTo方法是因为String类本身就已经重写过对应接口*/
        return num1;
    }


}
