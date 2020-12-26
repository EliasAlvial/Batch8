package com.syntax.repl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map211 {
    public static void main(String[] args) {
        Map<String, String> pairs=new HashMap<>();
        pairs.put("ONE","AAA");
        pairs.put("TWO","BBB");
        pairs.put("THREE","CCC");
        pairs.put("FOUR","DDD");
        pairs.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        Set<Entry<String, String>> set= pairs.entrySet();
        for (Entry<String, String>entry:set
             ) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("------------------");
        pairs.replace("THREE","ASEL");
        pairs.replace("FIVE","SUMAIR");
        System.out.println("HashMap After Replace :");
        for (Entry<String, String>entry:set
        ) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
