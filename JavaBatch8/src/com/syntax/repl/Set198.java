package com.syntax.repl;

import java.util.HashSet;
import java.util.Set;

public class Set198 {
    public static void main(String[] args) {
        Set<String> list=new HashSet<>();
        list.add("third");
        list.add("first");
        list.add("second");
        System.out.println(list);

        list.removeAll(list);
        System.out.println(list);

    }
}
