package com.syntax.reviewClass6;

public class Methods {
    public static void main(String[] args) {
        String name="Jack Plantin";
        //built-in are readonly we can't modify them
        System.out.println(name.length());
        Methods methods=new Methods();
        methods.getAndPrintLength("Jack");
    }

    public int getAndPrintLength(String name) {
        int length=name.length();
        if(length>15){
            System.out.println("Your name is too long");
        }else{
            System.out.println("You are good to go");
        }
        return length;
    }
}
