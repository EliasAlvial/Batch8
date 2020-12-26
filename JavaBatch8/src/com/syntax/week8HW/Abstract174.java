package com.syntax.week8HW;

public class Abstract174 {
    String imp;
    void m2(String imp){
        this.imp=imp;
        System.out.println(imp);
    }
    void m1(){
        System.out.println("Parent class providing implementation");
    }
}
class Child extends Abstract174 {
    @Override
    void m2(String imp) {
        System.out.println(imp);
    }
}
class Main extends Child {
    public static void main(String[] args) {
        Child child=new Child();
        child.m2("Child class providing implementation");
        child.m1();
    }
}
