package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		// Ask user for name 5 times-->Hello (name)
		//
		Scanner scan = new Scanner(System.in);
		String name;
		int var = 1;

		while (var <= 5)
			System.out.println("What is your name?");
		name = scan.nextLine();
		System.out.println("Nice to me you " + name);
		System.out.println("------------------------------");
		var++;

		System.out.println("-------------------");
//play a lottery where we need to enter number from 1--20
//lucky number is 7
		int num1;
		int num2=7;
		do{
		System.out.println("plese enter number");
		num1=scan.nextInt();}
		while(num1!=num2); {
			System.out.println("congratulations");
		}
		

	}

}
