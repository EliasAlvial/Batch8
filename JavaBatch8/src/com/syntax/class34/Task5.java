package com.syntax.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        String [] citiesArray={"Paris", "Moscow", "Washington DC", "Helsinki", "Oslo", "Berlin", "Ottowa"};

        Map<String, Integer> citiesMap=new TreeMap<>();
        for (String s:citiesArray         ) {
            citiesMap.put(s,s.length());

        }
        System.out.println(citiesMap);
        Iterator<Map.Entry<String, Integer>>iterator=citiesMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> element = iterator.next();
            if(element.getValue()>7){
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}
