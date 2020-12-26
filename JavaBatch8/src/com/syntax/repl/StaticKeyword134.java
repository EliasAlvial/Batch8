package com.syntax.repl;

public class StaticKeyword134 {


    public static String thirdLetter(String s){
       String newString="";
        for (int i = 0; i <s.length(); i++) {
            if(i%3==0){
                newString+=(s.charAt(i));
            }


        }
        return newString;
    }
    //Syntax version
    // static String thirdLetter(String s) {
    //
    //		String newString = "";
    //
    //		for (int i = 0; i < s.length(); i += 3) {
    //			newString += s.charAt(i);
    //		}
    //
    //		return newString;
    //	}


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
