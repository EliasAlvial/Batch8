package com.syntax.class27;

public abstract class Vehicle {
    String color;
    static int totalVehicle;
    Vehicle(){
        totalVehicle++;
        System.out.println("I will be called when ever an object of my Child " +
                "class will be created using no argument constructor");
    }
    Vehicle(String color){
        totalVehicle++;
        this.color=color;
        System.out.println();
        System.out.println("I will be called when ever an object of my Child" +
                "class will be created using one argument constructor");

    }
    public void drive(){
        System.out.println("Vehicle drives");
    }
    public void stop(){
        System.out.println("Vehicle stops");
    }
    public abstract void start();
    public abstract void brake();
}
abstract class Car extends Vehicle{
    String carType;
    Car(String color, String carType){
        super(color);
        this.carType=carType;

    }

    @Override
    public void brake() {
        System.out.println(carType+" have brakes");
    }
}
class Tesla extends Car{


    Tesla(String color, String carType) {
        super(color, carType);
        this.carType=carType;

    }

    @Override
    public void start() {

    }
}
