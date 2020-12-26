package com.syntax.class36;

public class Exception {
    public static void main(String[] args) {

        System.out.println("important line of code");
        System.out.println("Normal line of code");
        try{
            System.out.println(10/5);
        }catch (java.lang.Exception e){
            System.out.println("Can not divide by zero");
        }
        //System.out.println(10/0);//get an exception
        System.out.println("Important line of code");

    }


}
