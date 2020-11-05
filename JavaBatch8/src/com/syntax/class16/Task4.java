package com.syntax.class16;

public class Task4 {
    //Create a method that will say Hello in different language
    // based on the country that will passed when method is executed.
   static void sayHello(String country){
    switch(country){
        case "Chile":
        case "Venezuela":
        case "Peru":
            System.out.println("Hola");
            break;
        case"USA":
        case"Canada":
        case"England":
            System.out.println("Hello");
            break;
        case"China":
            System.out.println("Ni Hao");
            break;
        case"Israel":
            System.out.println("Shalom");
            break;
        case"Turkey":
            System.out.println("Merhaba");
            break;




    }

   }
}
