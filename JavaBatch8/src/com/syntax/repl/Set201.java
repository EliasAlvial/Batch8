package com.syntax.repl;

import java.util.*;

public class Set201 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for (int i = 0; i <2 ; i++) {
            Iterator<String> iterator = names.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());

            }
        }



    }
}

