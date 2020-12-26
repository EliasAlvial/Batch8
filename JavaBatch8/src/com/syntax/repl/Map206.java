package com.syntax.repl;

import java.util.HashMap;
import java.util.Map;

public class Map206 {
    public static void main(String[] args) {


    Map<Integer, String> fruit=new HashMap<>();
    fruit.put(1,"apple");
    fruit.put(2,"banana");
    fruit.put(3, "pear");
    fruit.put(4,"tomato");
    fruit.put(5, "mango");
    fruit.put(6,"kiwi");
        for (int key: fruit.keySet()
             ) {
            System.out.println("Key is "+ key+" and values is "+ fruit.get(key));
        }

}
}