package com.cases;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();/*map的应用*/
        map.put("gx","glj");
        map.put("zl","xzh");
        map.put("gj","hr");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("gx"));
    }
}
