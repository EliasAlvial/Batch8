package com.syntax.week8HW;

public class Abstract173 {
    String phrase1 = " without parameter";

    void m1(String phrase1) {
        System.out.println("m1" + phrase1);
    }


    void m1(String phrase1, String phrase2) {
        System.out.println("m1" + phrase2);
    }

    public static void main(String[] args) {
        Abstract173 abstract173 = new Abstract173();
        abstract173.m1(" without parameter");
        abstract173.m1(" method with parameter");
    }
}