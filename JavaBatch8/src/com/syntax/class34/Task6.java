package com.syntax.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {
        Map<String, Integer> employeeMap=new LinkedHashMap<>();
        employeeMap.put("Skywalke",150_000);
        employeeMap.put("Kenobi", 175_000);
        employeeMap.put("Palpatine",999_999);
        employeeMap.put("Mike", 1_000_000);
        employeeMap.put("Solo", 555_000);
        employeeMap.put("leia", 671_000);
        System.out.println(employeeMap);
        Iterator<Map.Entry<String, Integer>> iterator=employeeMap.entrySet().iterator();
        int highestSalary=0;
Map<String,Integer> map=new HashMap<>();
        String perssonName="";
        while(iterator.hasNext()){
            Map.Entry<String, Integer>next=iterator.next();
            if(next.getValue()>highestSalary){
                highestSalary=next.getValue();
                perssonName=next.getKey();
            }
        }
        for(Map.Entry<String, Integer> var: map.entrySet())
        System.out.println(perssonName+ "\n"+highestSalary);
    }
}
