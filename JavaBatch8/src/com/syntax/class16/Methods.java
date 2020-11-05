package com.syntax.class16;

import com.syntax.class13.Dog;

public class Methods {
    public static void main(String[] args) {
        System.out.println(addNumbers(10,20));
        System.out.println(addNumbers(0,10));
        System.out.println(addNumbers(15,25));
        System.out.println(addNumbers(35,10));
    }

    public static int addNumbers(int num1, int num2) {
        return num1+num2;//performing it this way we can use the printout
        // out above with any different numbers
    }


}
