package com.syntax.week8HW;

public interface Interface178 {
    void parentMethod();
}
interface ChildInterface extends Interface178 {
    void childInterface();
}

class Main2 implements ChildInterface{

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childInterface() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        Main2 mm=new Main2();
        mm.parentMethod();
        mm.childInterface();
    }
}