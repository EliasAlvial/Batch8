package com.syntax.week8;

public class ParentClass { void method(){
    System.out.println("Parent method");
}
}
class ChildClass{
    void method(){
        System.out.println("Child method");
    }
}
class Main {
    public static void main(String[] args) {
        ParentClass parent=new ParentClass();
        parent.method();
        ChildClass child=new ChildClass();
        child.method();

    }
}
