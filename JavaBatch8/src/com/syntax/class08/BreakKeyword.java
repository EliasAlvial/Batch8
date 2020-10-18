package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
	
	
	//break
		
		for(int i=1; i<4; i++) {
			System.out.println("Hello");
			break;
		}
	//We want to print numbers from 1-10
	//when number is 5 want to break the loop
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if (i==5) {
				break;// breaks the loop!
			}
			
		}System.out.println("No more soup for you!");
		
		System.out.println("---------------------------");
		boolean workday=true;
		int day=1;
		while(workday){	
	if(day<=5) {
			System.out.println("I need a day off");
	
	}else{
		System.out.println("I do not need a day off anymore");
		break;
	}
	day++;//needs to be outside of "if/else" but inside of "while"
		}System.out.println("get back to work you lazy");
}
}
