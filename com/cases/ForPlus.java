package com.cases;

public class ForPlus {
    public static void main(String[] args) {
        int[] t={1,2,3,4,6};
        for(int i: t){/*增强for循环其内部本质就是一个迭代器，用来简化数组和集合遍历*/
            System.out.println(i);
        }
        String[] s={"hello","world","Ni"};
        for(String j: s){/*也可以遍历collection集合，类似写*/
            System.out.println(j);
        }
    }
}
