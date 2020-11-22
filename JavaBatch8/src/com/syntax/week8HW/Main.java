package com.syntax.week8HW;

public class Main {
    /*
    Create an instance final method that will reverse a String and return that new String

Call method from the main method

     */
    public final String rev(String rev){
        StringBuilder stringBuilder=new StringBuilder(rev);
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {

    }
}
