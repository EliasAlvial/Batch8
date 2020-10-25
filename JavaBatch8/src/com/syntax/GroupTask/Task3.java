package com.syntax.GroupTask;

public class Task3 {
	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series
		
		int num = 10;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(" the first " + num + " of Fibonacci seq: ");
		
		for (int i = 1; i <= num; i++) {
			
			System.out.print(num1 + " + ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
			
			
			}
		
	}
}
