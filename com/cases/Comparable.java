package com.cases;

import com.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparable {
    public static void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<Student>();
        Student stu1=new Student("付佳景",22);
        Student stu2=new Student("陆雨南",19);
        Student stu3=new Student("卢清",26);
        Student stu4=new Student("黄康",23);
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        System.out.println(treeSet);
        TreeSet<Student> treeSet1=new TreeSet<Student>(new Comparator<Student>() {/*通过构造方法使用它的自然排序*/
            @Override
            public int compare(Student s1, Student s2) {/*这种自然排序就可用来进行学生成绩排名等等*/
                int num=s1.getAge()-s2.getAge();
                int num1=num==0?s1.getName().compareTo(s2.getName()):num;
                return num1;
            }
        });
        treeSet1.add(stu1);
        treeSet1.add(stu2);
        treeSet1.add(stu3);
        treeSet1.add(stu4);
        System.out.println(treeSet1);
    }
}
