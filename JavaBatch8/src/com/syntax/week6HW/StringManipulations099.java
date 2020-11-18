package com.syntax.week6HW;

import java.util.Scanner;

public class StringManipulations099 {
    public static void main(String[] args) {
        /*
        Using Scanner class input string value.
        Print out the following: "The first 3 letters of ___ is ___"
         */
        String inp;
        Scanner scan=new Scanner(System.in);
        inp=scan.nextLine();

        System.out.println("The first 3 letters of "+inp+" is " +inp.substring(0,3));


    }
}
