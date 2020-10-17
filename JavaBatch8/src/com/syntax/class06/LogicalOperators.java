package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperators {
public static void main(String[] args) {
	
	Scanner inp=new Scanner(System.in);
	
	boolean JavaEasy=false;
	if(!JavaEasy) {
		System.out.println("Please try to spendmore time with Java"); 
	}
	
	System.out.println("----------------------------------------");
	
	String day="Sunday";
	
	if(!(day.equals("Sunday")  || day.equals("Saturday"))){
		System.out.println("We will have to go to work!");
	}else {
		System.out.println("We party like it's 1969!");
		
	}
}
}
