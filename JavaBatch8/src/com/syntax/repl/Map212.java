package com.syntax.repl;

import java.util.*;
import java.util.Map.Entry;

public class Map212 {
    public static void display(Map<String, Integer> pairs){
        if (!pairs.isEmpty()){
            for (String keys:pairs.keySet()){
                System.out.println(keys +" : "+pairs.get(keys));

            }

        }else{
            System.out.println("map is empty");
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        display(map);
        map.clear();
        display(map);
    }
}
