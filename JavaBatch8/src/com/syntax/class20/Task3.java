package com.syntax.class20;

import com.syntax.class16.Task;

public class Task3 {
    /*
    Write a program that will have 4 different access levels of constructors and create 3 objects of this class:
    1-inside some class; 2-from outside the class;
    3- from different class inside different package and observe result.
     */
    String name;
    int age;
    double salary;
   private Task3(String name){
       //i can only create objects of my class from the same class
        this.name=name;
    }
    Task3(int age){
        this.age=age;
    }
    public Task3(double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
       // Task3 task1=new Task3();CE as now Java will not not create the default constructors
        Task3 task1=new Task3("Elias");
    }
}
