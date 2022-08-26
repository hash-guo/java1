package com.collec;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<String>();/*向上转型，利用多态调用父类collection方法*/
        List<String> list=new ArrayList<String>();
        col.add("one");
        col.add("two");
        col.add("three");
        list.add("jk");/*List父类特有方法，按索引添加，移除，修改(set)元素，获取元素(get)*/
        list.add(0,"ly");
        list.add("gx");
        System.out.println(col.contains("six"));
        Iterator<String> iter=col.iterator();/*获取collection元素迭代器，用来遍历collection集合元素(注意此时不能修改集合)*/
        ListIterator<String> iter1=list.listIterator();/*获取List元素迭代器*/
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        while(iter1.hasNext()){
            String s=iter1.next();
            if (s.equals("gx")){
                iter1.add("lj");/*和collection迭代器不同，它还有add方法(还有很多其特有的方法)来添加元素*/
            }
//            System.out.println(iter1.next());
        }
        System.out.println(list);
     }
}
