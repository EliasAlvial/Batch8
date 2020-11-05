package com.syntax.class17;

public class Variables {
    int instanceNum=45;//These variable will be stored throughout the whole class
    public void varsDemo(){
        int number1=10;// this variable is a local variable because it is solely inside of these swigly brackets
        System.out.println(number1);
    }
    public void varsDemo1(){
    int number2=-10;//these can only be access inside these methods.
        System.out.println(number2);
    }
}
