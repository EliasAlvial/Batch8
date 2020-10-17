package com.syntax.class04;

public class Task {

	public static void main(String[] args) {
		
		int var1=-6;
		
		if (var1>0) {
			System.out.println("This number is positive");
		}else if(var1<0) {
			System.out.println("This number is negative");
		}else {
			System.out.println("This number is 0");
		}
		
		System.out.println("-----------------");
	
	int num=2;
	
	if (num%2==0) {
		System.out.println("This is an =even number");
	}else {
		System.out.println("This is an odd number");
	}
			
	System.out.println("------------------TASK1------------------");
	
	boolean diploma=true;
	double gpa=3.2;
	
	if(diploma){
		System.out.println("Congratulaions!!!!");
		if (gpa>3.5) {
			System.out.println("Congratulations, you are eligble for a scholorship!");
		}else if(gpa<3.5){ 
			System.out.println("You should have studied harder");
		}
	
	}else {
		System.out.println("You should get one!");
	}
	
	System.out.println("-------------------TASK2-------------");
	
	double mortRt=4.0;
	boolean buying=true;
	int price=199000;
	if(mortRt<4.5) {
		System.out.println("Let's get a house!");
	if(price>200000){
		System.out.println("Will have to get a loan!");
	}else if(price<200000){
		System.out.println("We can get this with Cash!");
	}
		
		
}else {
		System.out.println("Will not buy today!");
	}
	
	
	
	}
	
}
