package com.syntax.reviewClass6;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator=new Calculator(15);
        calculator.add(10);
        calculator.printNumber();
        calculator.sub(100);
        calculator.printNumber();
    }
}
