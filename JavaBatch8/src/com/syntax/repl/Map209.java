package com.syntax.repl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Map209 {
    public static void main(String[] args) {
        Map<String, String> pairs = new HashMap<>();
        pairs.put("Street", "Patrick ST");
        pairs.put("Suite", "265");
        pairs.put("City", "Vienna");
        pairs.put("Zip", "22180");
        pairs.put("Country", "United State");

        Set<Entry<String, String>> setEntry = pairs.entrySet();


        for (Entry<String, String> entry : setEntry) {
            String value;
            value = entry.getValue().toUpperCase();
            System.out.println(value);
        }
    }



    }

