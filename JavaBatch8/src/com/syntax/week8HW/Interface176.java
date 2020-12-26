package com.syntax.week8HW;

public interface Interface176 {
    void method1();
    void method2();
}
class Inta implements Interface176 {

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        Inta inta=new Inta();
        inta.method1();
        inta.method2();

    }
}

