package com.syntax.class22;

public class MethodOverloading {
    int number;
    String name;

    public void print(){
        System.out.println("print wit no Arguemtns");
    }
    public void print(String name, int number){
        System.out.println("String name, int number");
    }
    public void print(int number, String name){
        System.out.println("int number, String name");

    }
    public String print(String name){
        System.out.println("String name");
        return "name";
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("name", 123);
        methodOverloading.print(123, "name");
    }
}
