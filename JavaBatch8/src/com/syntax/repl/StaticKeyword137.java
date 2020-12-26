package com.syntax.repl;

import com.google.common.base.Strings;

public class StaticKeyword137 {
    static int countVowels(String s){
        int a=0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
            if (s.charAt(i) == 'e') {
                a++;
            }
            if (s.charAt(i) == 'i') {
                a++;
            }
            if (s.charAt(i) == 'o') {
                a++;
            }
            if (s.charAt(i) == 'u') {
                a++;

            }
        }

    return a;

    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
    // Syntax version
    // static int  countVowels(String s)
    //	{
    //		String count = s.replaceAll("[^aA,eE,iI,oO,uU]", "");
    //		return count.length();
    //	}
    //
    //	//test case below (dont change):
    //	public static void main(String[] args){
    //		System.out.println(countVowels("obama")); //3
    //		System.out.println(countVowels("happy friday! i love weekends")); //9
    //	}
}
