package com.syntax.class05;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary.
		 *  If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 *  otherwise he is not. 
		 *  Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 *  otherwise bonus=3000.
		 */
	
	Scanner scan;
	int yearsWorked;
	int annual;
	
	scan=new Scanner(System.in);
	
	System.out.println("How many years have you worked at this company?");
	yearsWorked=scan.nextInt();
	
	
	
	if(yearsWorked>=5) {
		System.out.println("What is your annual salary?");
		annual=scan.nextInt();
		if(annual>50000) {
			System.out.println("You are eligible for a $5000 bonus");
		}else {
			System.out.println("You are eligible for a $3000 bonus");
		}
	}else {
		System.out.println("You are not eligible for raise");
	}
	
	
	
	
	
	
	}
	

}
