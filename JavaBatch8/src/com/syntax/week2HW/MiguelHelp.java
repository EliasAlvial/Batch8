package com.syntax.week2HW;

import java.util.Scanner;

public class MiguelHelp {
	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);

	
	System.out.println("Please enter your gender:");
	
	
	char gen1 = input.next().charAt(0);

	
	System.out.println("Please enter your age");
	int age = input.nextInt();
	
	if(gen1=='F')
	if(gen1>=25) {
		System.out.println("Man");
	}else if(gen1<25) {
		System.out.println("Boy");
	}else
		if(gen1<=25) {
		System.out.println("Woman");
	}else if(gen1<25) {
		System.out.println("Girl");

	}
	}
	}

	
