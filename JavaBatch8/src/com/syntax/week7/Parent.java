package com.syntax.week7;

import java.sql.SQLOutput;

public class Parent {
    String method1, method2, method3, method4;

    public void method1(String method1){
        this.method1=method1;
        System.out.println("I am parent public");
    }
    protected void method2(String method2){
        this.method2=method2;
        System.out.println("I am parent protected");
    }
    void method3(String method3){
        this.method3=method3;
        System.out.println("I am parent defualt");
    }
    private void method4(String method4){
        this.method4=method4;
        System.out.println("I am parent private");
    }

}
class Child extends Parent{


    public void method1() {

        System.out.println("I am a child public method");

    }
    protected void method2(){
        System.out.println("I am a child protected method");
    }
    void method3(){
        System.out.println("I am a child defualt method");

    }
    private void method4(){
        System.out.println("I am a child private method");
    }
}
class Main{
    public static void main(String[] args) {
        //Parent parent=new Parent();
        Child child=new Child();
        child.method1();
        child.method2();
        child.method3();
        //child.method4();






    }

}