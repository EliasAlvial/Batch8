package com.syntax.class04;

public class IfElseIf {
	public static void main(String[] args) {
		/* 
		 * we need to compare 2 numbers:
		 * bigger, smaller or equal
		 */
		
		int num1, num2;
		num1=109;
		num2=99;
		if (num1>num2) {//what if this condition is true
			System.out.println(num1 + " is bigger than "+num2);
		}else if(num1<num2) {//or what if this is true 
			System.out.println(num1 + " is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
	
	System.out.println("-------------------------");
	
	/* Based on the day of the week we will print class schedule
	 * 
	 */
	
	
	int day=70;
	
	if (day==1) {
		System.out.println("Today is Monday we have no class");
	}else if (day==2) {
		System.out.println("Toay is Tuesday we have Manual class");
		
	}else if (day==3) {
		System.out.println("Today is Wednesday we have Manual class");
	}else if(day==4) {
	System.out.println("Today is Thursday we have Review class");
	
	} else if(day==5) {
		System.out.println("Today is Friday and we do not have class");
	}else if (day==6) {
		System.out.println("Today is Saturday and I have Java class today");
	}else if (day==7) {
		System.out.println("Today is Sunday and I have Java class today");
	}else {
		System.out.println("This is an invalid day of the week");
	}
	System.out.println("");
	}
}
