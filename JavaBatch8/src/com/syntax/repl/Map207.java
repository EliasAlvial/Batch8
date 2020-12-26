package com.syntax.repl;

import java.util.*;

public class Map207 {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

    Iterator<String> it=map.keySet().iterator();
        String key;
        while(it.hasNext()){
            key= it.next();
            System.out.println("Key = "+key +" and value = "+map.get(key));
        }
        }


    }

