package com.syntax.class17;

public class Student {

//Instance Variables take up a lot fo space and should only be used when neceseary.
// This is when same variables are needed for other methods.
    String name;
    int age;
    double marks;
    int numberOfStudentsEnrolled;
    public void printInfo(){
        System.out.println("Name "+name+"Age "+age+" Marks "+marks );
    }
}
