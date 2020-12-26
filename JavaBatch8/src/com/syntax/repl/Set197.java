package com.syntax.repl;

import java.util.HashSet;
import java.util.Set;

public class Set197 {
    public static void main(String[] args) {
        HashSet<Integer> Hashset=new HashSet<>();
        Hashset.add(111);
        Hashset.add(111);
        Hashset.add(111);
        Hashset.add(999);
        Hashset.add(999);
        Hashset.add(999);

        for (Integer hash:Hashset
             ) {
            System.out.println(hash);

        }
    }
}
