package com.syntax.class08;

import java.util.Scanner;

public class Task2cont {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("-------task4--------------------------");
	
	/* 
	 * Write a program to ask a user to enter item they want to buy and the price of that item.
	 *  Every time user enters money accumulate the amount 
	 *  and tell the user how much is left to pay off. 
	 *  If user give more money program should return a change. 
	 *  Whenever a user done with payments program should say “Thank you for shopping!”
	 */
	
	double num1,num2, num3;
	System.out.println("Please enter item tou would like to buy and the price of item");
	String item=scan.next();
	num1=scan.nextDouble();
	
	 System.out.println("Please enter how much you would like to pay");
	 num2=scan.nextDouble();
	 
while(num1!=num2) {
	if(num1>num2) {
		num3=num1-num2;
		System.out.println("You still owe "+num3);
		break;
	}else if(num2>num1) {
		num3=num2-num1;
		System.out.println("Your change is "+num3);
		break;
	}
}System.out.println("Thank you for purchasing "+item);
}
}
