package com.syntax.class08;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	System.out.println("Print numbers from 1 to 50 except those that are divisible by 3");
	System.out.println("-------task1--------------------------");
	for (int i=1; i<=50; i++) {
		if (i%3==0) {
			continue;
		}
		System.out.println(i);
	}
	System.out.println("Create a program that will keep asking user to apply for a credit card. "
			+"As soon you get “yes” from a user program should stop asking.");
	System.out.println("-------task12--------------------------");
	boolean CC;
	Scanner scan=new Scanner(System.in);
	System.out.println("Would you like to apply for a Credit Card(true/false)");
	CC=scan.nextBoolean();
	while(CC==false) {
		System.out.println("Would you like to apply for a Credit Card");
		CC=scan.nextBoolean();
		if(CC==true) {
			break;
		}
		
		System.out.println("-------task3--------------------------");
	}System.out.println("Enjoy your new Credit Card");
	
	System.out.println("------------------------------------------");
	/*
	 * Write a program that reads a range of integers (start and end point), 
	 * provided by a user and then from that range prints 
	 * the sum of the even and odd integers
	 */
	int sumA =0;
	int sumB=0;
	int a,b;
	System.out.println("Please enter range you would like to input ex(1-50)");
	a=scan.nextInt();
	b=scan.nextInt();
	for (int i = a; i <= b; i++) {
		if (i % 2 == 0) {
			sumB+=i;
		} else {
			sumA+=i;
		}
		
	}
	System.out.println("The sum of even numbers 1 to 50 is "+ sumB);
	System.out.println("The sum of odd numbers 1 to 50 is "+ sumA);
	

	
}
}
