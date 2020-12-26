package com.syntax.repl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map210 {
    public static void main(String[] args) {
        Map<String, String> pairs=new HashMap<>();
        pairs.put("ONE","AAA");
        pairs.put("TWO","BBB");
        pairs.put("THREE","CCC");
        pairs.put("FOUR","DDD");
        pairs.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");
        Set<Entry<String, String>> set= pairs.entrySet();

        for (Entry<String, String> entry:set){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("------------------");
        pairs.remove("ONE", "AAA");
        pairs.remove("FOUR", "DDD");

        System.out.println("HashMap After Remove :");

        for (Entry<String, String> entry : set) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
