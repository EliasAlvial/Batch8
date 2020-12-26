package com.syntax.repl;

public class JavaMethods116 {
//    int num1, num2, num3, num4, num5,num6
    void addition(int num1, int num2){
        System.out.println("Addition "+(num1+num2));
    }
    void mult(int num3, int num4){
        System.out.println("Multiplication "+num3*num4);
    }
    void sub(int num5, int num6){
        System.out.println("Subtraction "+(num5-num6));
    }

    public static void main(String[] args) {
        JavaMethods116 mm=new JavaMethods116();
        mm.addition(15,15);
        mm.mult(5,6);
        mm.sub(30,10);
    }
}

