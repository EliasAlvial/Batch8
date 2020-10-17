package com.syntax.class06;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int num1, num2, num3, biggest;
		System.out.println("Please enter 3 numbers");
		num1=inp.nextInt();
		num2=inp.nextInt();
		num3=inp.nextInt();
		inp.close();
		
		
		
		if(!(num1 ==num2 &&num2==num3)) {
		
		if(num1>num2 &&num1>num3) {
			biggest=num1;
			}else if(num2>num3){
				biggest=num2;
			}else {
				biggest=num3;
		}System.out.println("The bigggest number is " +biggest);
	}else {
			System.out.println("Numbers are equal");
		}
}
}