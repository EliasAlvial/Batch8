package com.syntax.class13;

public class SmartPhone {

    String brand;
    int storage;
    String color;
    String model;

    void call(long number){
        System.out.println(brand+" is calling "+number);
    }
    void text(){
        System.out.println(brand+" can text");
    }
    void pics() {
        System.out.println(brand + " can take a picture");
    }

}
