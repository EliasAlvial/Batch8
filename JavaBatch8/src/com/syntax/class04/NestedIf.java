package com.syntax.class04;

public class NestedIf {
public static void main(String[] args) {
	
	boolean allergy=true;
	boolean petAllergy=false;
	if (allergy) {
		System.out.println("Lets do further check");
		if(petAllergy) {
			System.out.println("Please no cats or dogs in the house");
		}else {
			System.out.println("That is good you do have pet allergy");
		}
	}else {
		System.out.println("You are lucky");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("------------EXAMPLE 2---------");
	
	/*
	 * if today is Friday we will watch movie but would like to check the date
	 * 
	 * 				if date is 13----> scary movie
	 * 				if its not---> comedy
	 * 
	 * if not Friday ---> Im studying
	 */
	
	boolean isFriday=false;
	int date=13;
	boolean Monday=true;
	
	if(isFriday) {
		if(date==13) {
			System.out.println("I will watch scary movie");
		}else {
		System.out.println("I will watch a comedy");
		}
		
		
	}else {
		if(Monday) {
			System.out.println("I am working");
		}else {
			System.out.println("I will have class");
		}
	}
	
	System.out.println("--------------EXAMPLE 3----------");
	
	/* check if assignment is completed
	 * if assignment is completed:
	 * 				if score >90---> good job
	 * 				if
	 */
	
	int score=69;
		boolean assignment=true;
	
		if (assignment) {
			if(score>90) {
				System.out.println("You did great job!!!");
			
			}else if(score>80) {
				System.out.println("You did good!");
			}else if(score>70){
				System.out.println("Probably need to study more");
				
			}else {
				System.out.println("Thanks for trying but you need to study more!");
				
		}
}else {
			System.out.println("You should always do all the homework");
		}
	
	
	
	
	
}
}
