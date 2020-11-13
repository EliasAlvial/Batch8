package com.syntax.class19;

public class Task1 {
    /*
    Write a program that will have a constructor: one with parameters
    and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
int age;
String name;
char grade;

Task1(){
    System.out.println("I will be called when no arguments are passed to the constructor");
}Task1(int ageValue, String nameValue){
        age=ageValue;
        name=nameValue;
        System.out.println("I will be called when 2 arguments are passed to the constructor");
    }
Task1(int ageValue, String nameValue, char gradeValue){
    age=ageValue;
    name=nameValue;
    grade=gradeValue;
    System.out.println("I will be called when 3 arguments are passed to the constructor");
}
Task1(int ageValue){
        age=ageValue;

        System.out.println("I will be called when 1 arguments are passed to the constructor");
    }

    public static void main(String[] args) {
        Task1 yes1=new Task1(30, "Jack", 'K');
        Task1 yes2=new Task1(30, "Jack");
        Task1 yes3=new Task1(25);
        Task1 yes4=new Task1();
    }

}
