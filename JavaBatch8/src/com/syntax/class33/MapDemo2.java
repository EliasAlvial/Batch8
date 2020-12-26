package com.syntax.class33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hasmap=new HashMap<>();

        hasmap.put(111, "Jack");
        hasmap.put(222, "Vladimir");
       hasmap .put(333, "Maria");
        hasmap.put(444, "Denis");
        hasmap.put(555, "Daria");
        hasmap.put(666, "Jassor");

        System.out.println(hasmap);
        Map<String, Integer> linkedHashmap=new LinkedHashMap<>();
        linkedHashmap.put("Jack", 111);
        linkedHashmap.put("Vladimir", 222);
        linkedHashmap.put("Maria", 333);
        linkedHashmap.put("Danis", 444);
        linkedHashmap.put("Daria", 555);
        linkedHashmap.put("Jassor", 666);
        System.out.println(linkedHashmap);

        Map<String, Integer> treMap=new TreeMap<>();
        treMap.put("Jack", 111);
        treMap.put("Vladimir", 222);
        treMap.put("Danis", 444);
        treMap.put("Daria", 555);
        treMap.put("Jassor", 666);
        System.out.println(linkedHashmap);

    }
}
