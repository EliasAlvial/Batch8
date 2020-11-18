package com.syntax.week6HW;

public class Main {
    String color;
    int year;
    String make;

    public static void main(String[] args) {
    Main car1=new Main();
    car1.color="Black";
    car1.year=2019;
    car1.make="BMW";

    Main car2=new Main();
    car2.color="White";
    car2.year=2018;
    car2.make="Toyota";



        System.out.println("Car color is "+car1.color+" and car year is "+car1.year+" and car model is "+car1.make);
        System.out.println("Car color is "+car2.color+" and car year is "+car2.year+" and car model is "+car2.make);
    }

}
