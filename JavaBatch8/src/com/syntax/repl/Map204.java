package com.syntax.repl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map204 {
    public static void main(String[] args) {
        Map<String, String> pairs=new HashMap<>();
        pairs.put("Street", "Patrick ST");
        pairs.put("Suite", "P265");
        pairs.put("City", "Vienna");
        pairs.put("Zip", "22180");
        pairs.put("Country", "United States");
//        System.out.println(pairs.get("Street"));
//        System.out.println(pairs.get("Suite"));
//        System.out.println(pairs.get("City"));
//        System.out.println(pairs.get("Zip"));
//        System.out.println(pairs.get("Country"));
        for (String keys:pairs.keySet()
             ) {
            System.out.println(pairs.get(keys));

        }
    }
}
