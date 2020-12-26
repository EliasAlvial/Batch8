package com.syntax.repl;

import java.util.*;

public class Map208 {
    public static void main(String[] args) {
        Map<String, String> pairs=new LinkedHashMap<>();
        pairs.put("Street", "Patrick ST");
        pairs.put("Suite", "265");
        pairs.put("City", "Vienna");
        pairs.put("Zip", "22180");
        pairs.put("Country", "United State");

        Iterator<String> it=pairs.keySet().iterator();
        while(it.hasNext()){
         String key= it.next();
            System.out.println(pairs.get(key));
        }

        //Answer Key
//        public static void main(String[] args) {
//            Map<String, String> map = new LinkedHashMap<>();
//            map.put("Street", "Patrick ST");
//
//            map.put("Suite", "265");
//
//            map.put("City", "Vienna");
//
//            map.put("Zip", "22180");
//
//            map.put("Country" , "United State");
//
//            Collection<String> values=map.values();
//            Iterator<String> it=values.iterator();
//            while(it.hasNext()){
//                System.out.println(it.next());
//            }
//        }
    }
}
