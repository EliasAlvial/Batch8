package com.syntax.class25;

public class FinalMethodClass {
    final double PI=3.14;//this is a Constant

    void calculateAreaOfCircle(double radius){//this is a Method!
        System.out.println("Area of circle is "+(PI*radius*radius));
    }

    double add(double num1, double num2){
        return num1+num2;
    }
    final public void printName(){
        System.out.println("hello world");
    }
}
