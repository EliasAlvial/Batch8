package com.syntax.week6HW;

import com.syntax.class13.Dog;

public class ClassAndObject091 {
    String breed, name, color;

    void bark(){
        System.out.println(breed+" can bark");
    }
    void run(){
        System.out.println(breed+" can run");
    }
    void play(){
        System.out.println(breed+" can play");
    }

    public static void main(String[]args){
        ClassAndObject091 dog1=new ClassAndObject091();
        dog1.breed="Husky";
        dog1.name="Volky";
        dog1.color="black and white";
        dog1.bark();
        dog1.run();
        dog1.play();

        ClassAndObject091 dog2=new ClassAndObject091();
        dog2.breed="Bulldog";
        dog2.name="Volky";
        dog2.color="black and white";
        dog2.bark();
        dog2.run();
        dog2.play();

        ClassAndObject091 dog3=new ClassAndObject091();
        dog3.breed="Labrador";
        dog3.name="Volky";
        dog3.color="black and white";
        dog3.bark();
        dog3.run();
        dog3.play();


    }
}
