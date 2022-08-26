package com.cases;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<String>();/*linklist是基于链表的，相对于基于数组的ArrayList其增删更快，查询慢*/
        link.add("first");
        link.add("second");
        link.add("third");
        link.addFirst("king");
        link.removeLast();/*删除并返回最后一个元素*/
        System.out.println(link);

//        set集合，其不包含重复元素，不保证元素迭代顺序
        Set<String> set=new HashSet<String>();/*和collection类似，set也有对应实现类，比如hashset、linkedhashset、treeset(按照某种顺序输出，由内部自然排序实现，不过要对应类先重写方法)等等*/
        set.add("first");
        set.add("second");
        set.add("third");
        System.out.println(set);
        Set<String> set1=new LinkedHashSet<String>();/*linkedhashset保证顺序*/
        set1.add("first");
        set1.add("second");
        set1.add("third");
        System.out.println(set1);
    }
}
