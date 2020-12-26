package com.syntax.repl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map205 {
    public static void main(String[] args) {
        Map<String, String> pairs=new LinkedHashMap<>();
        pairs.put("Street", "Patrick ST");
        pairs.put("Suite", "P265");
        pairs.put("City", "Vienna");
        pairs.put("Zip", "22180");
        pairs.put("Country", "United States");
        System.out.println(pairs.size());
        pairs.clear();
        System.out.println(pairs.size());
    }
}
