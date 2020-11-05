package com.syntax.class13;

public class Dog {
    //write some attribute that a dog can have
   String name;
    String breed;
    String color;
    boolean loyalty;
    int age;
    String gender;

  public void bark(){
        System.out.println("Dog barks");
    }//if we do not make it public we will not be able to access it outside its designated package
   public void play(){
        System.out.println("My dog plays with my kids");
    }
    public void sit(){
        System.out.println("Do sits");
    }
     void getsBeer(){
        System.out.println("Gets me my beer");
    }//if I put private they will not be able to access even in same package
}
