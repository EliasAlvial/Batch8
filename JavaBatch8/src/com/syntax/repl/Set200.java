package com.syntax.repl;

import java.util.HashSet;
import java.util.TreeSet;

public class Set200 {
    public static void main(String[] args) {
        HashSet<String> cont=new HashSet<>();
        cont.add("India");
        cont.add("Australia");
        cont.add("South Africa");
        cont.add("India");
        cont.add("America");
        cont.add("America");

        TreeSet<String> tree=new TreeSet<>(cont);
        System.out.println(tree);



    }
}
