package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {	public static void main(String[] args) {
	// Ask user for name 5 times-->Hello (name)
	//
	Scanner scan = new Scanner(System.in);
	String name;
	
	int num1;
	int num2=7;
	do{
	System.out.println("please enter number");
	num1=scan.nextInt();
	}while(num1!=num2);
		System.out.println("congratulations");
	}
	
	

}


