package com.hypergeekturtles.assignment14;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");

        System.out.println(mapAB2(map));
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}
