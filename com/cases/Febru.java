package com.cases;

import java.util.Calendar;
import java.util.Scanner;

public class Febru {
    /*小案例：求输入的年份对应二月份有多少天*/
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            System.out.println("请输入年份：");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            Calendar cal = Calendar.getInstance();
            cal.set(year, 2, 1);
            cal.add(Calendar.DATE, -1);
            int date = cal.get(Calendar.DATE);
            System.out.println(year + "年的二月份天数为:" + date + "天");
        }

    }
}
