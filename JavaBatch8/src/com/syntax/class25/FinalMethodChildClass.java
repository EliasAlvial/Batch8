package com.syntax.class25;

public class FinalMethodChildClass extends FinalMethodClass {
    //PI=3.14;//can not be reinitialized because it is final
    //double PI=3.15;//This can be done because we are creating a new variable and calling from the parent class.

    @Override//this is used when you want to inherit from the parent class but you want to do something different in the code
    double add(double num1, double num2){
        super.printName();

        System.out.println("new code added in the child class");
        return num1+num2;//it can also be done like this but it is not calling
        // from the parent class but rather referring through writing out
       // return super.add(num1,num2);//this is calling it from the parent class from SUPER.

    }

    public  void main(String[] args) {
        super.printName();
    }
}
