package com.syntax.week2HW;

import java.util.Scanner;

public class ScannerClass022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=input.nextLine();
		
		System.out.println("Enter your mobile number");
		String mobile=input.nextLine();
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		System.out.println("Your name is " + name + ", your age is " + age+ " and your mobile number is " + mobile);
		
		
		
		
		

	}

}
