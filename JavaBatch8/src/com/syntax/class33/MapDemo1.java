package com.syntax.class33;

import java.util.HashMap;



public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();

        map.put(111, "Jack");
        map.put(222, "Vladimir");
        map.put(333, "Maria");
        map.put(444, "Denis");
        map.put(555, "Daria");
        map.put(666, "Jassor");

        System.out.println(map);
    }
}