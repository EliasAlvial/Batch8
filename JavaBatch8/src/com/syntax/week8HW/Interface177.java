package com.syntax.week8HW;

public interface Interface177 {
    void firstMethod();

}
interface SecondInterface{
    void secondMethod();
}
class Inherit implements Interface177,SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {
        Inherit m1=new Inherit();
        m1.firstMethod();
        m1.secondMethod();
    }
}
