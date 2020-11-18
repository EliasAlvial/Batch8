package com.syntax.week8;

public class Animal {
    /*
    Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
     */
    String Animal;
    Animal(String Animal){
        this.Animal=Animal;
    }

    void eat(){
        System.out.println("eats");
    }
    void sleep(){
        System.out.println("sleeps");
    }
}
class Cat extends Animal{
    public Cat(String Animal) {
        super(Animal);
    }

    @Override
    void eat() {
        System.out.println(Animal+" eats");
    }

    @Override
    void sleep() {
        System.out.println(Animal+" sleeps a lot");
    }
}
class kitten1 extends Cat{

    public kitten1(String Animal) {
        super(Animal);
    }

    @Override
    void eat() {
        System.out.println(Animal+" eats milk");
    }
}
class kitten2 extends Cat{
    public kitten2(String Animal) {
        super(Animal);
    }

    @Override
    void eat() {
        System.out.println(Animal+" eats snack");
    }
}
class kitten3 extends Cat{
    public kitten3(String Animal) {
        super(Animal);
    }
    void eat(){
        System.out.println(Animal+" eats everything");
    }
}

class main{
    public static void main(String[] args) {
        Animal[] kittens={new Cat("Cat"),new kitten1("kitten1"), new kitten2("kitten2"), new kitten3("kitten3")};

        for(Animal animal:kittens){
            animal.eat();
            animal.sleep();
        }
    }
}
