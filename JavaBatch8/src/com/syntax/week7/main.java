package com.syntax.week7;

class Parent1{

    Parent1(String Child){

    }
     void hello(){
        System.out.println("method in Parent class");
    }

}
class Child1 extends Parent1{
    Child1(String Child) {
        super(Child);

    }
    @Override
    void hello() {
        System.out.println("method in Child1 class");

    }
}
class Child2 extends Parent1 {
    Child2(String Child) {
        super(Child);
    }

    @Override
     void hello() {
        System.out.println("method in Child2 class");
    }
}
class Child3 extends Parent1 {
    Child3(String Child) {
        super(Child);
    }

    @Override
     void hello() {
        System.out.println("method in Child3 class");
    }
}

public class main {
    /*
    Create a method hello() in parent class that will print "method in Parent class" then override
    that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
    In Main Class create 3 object of the child classes and store in into an array and call method hello():

     */
    public static void main(String[] args) {
      Parent1[] Children={new Child1("Child1"), new Child2("Child2"), new Child3("Child3")};

      for (Parent1 parent1:Children){
         parent1.hello();

      }

    }

}
