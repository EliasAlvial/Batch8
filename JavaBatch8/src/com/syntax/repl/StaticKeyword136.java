package com.syntax.repl;

public class StaticKeyword136 {
    static int countA(String s){
        int a=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
            }
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        return a;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
