package com.syntax.class07;

import java.util.Scanner;

public class HWJava {
public static void main(String[] args) {
	double num1, num2;
	double result=0;
	char operator;
	
	
Scanner scan=new Scanner(System.in);
System.out.println("Please enter two numbers");	
	num1=scan.nextDouble();
	num2=scan.nextDouble();
System.out.println("Please enter an operator you would like to use +,-,*,/");	
operator=scan.next().charAt(0);
	
	switch(operator) {
	case("+"):
		result=num1+num2;
		break;
	case("-"):
		result=num1-num2;
	  break;
	case ("*"):
		result=num1*num2;
	  break;
	case ("/"):
		result=num1/2;
	  break;
	default :
		System.out.println("error");
		break;
	}
	
	 if(operator==‘+’ || operator==‘-’ || operator==‘*’ || operator==‘/’) {
		 System.out.println(“The ” + operator + ” of two numbers is ” + result);
			
	 }
}
}
