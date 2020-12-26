package com.syntax.repl;

public class StaticKeyword132 {
    static String mixString(String s1,String s2) {
        String mixString="";
        for (int i = 0; i < s1.length(); i++) {
            mixString = mixString + s1.charAt(i) + s2.charAt(i);
        }
        return mixString;
    }

    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}
