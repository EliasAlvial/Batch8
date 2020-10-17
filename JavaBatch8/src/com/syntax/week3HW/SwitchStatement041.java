package com.syntax.week3HW;

import java.util.Scanner;

public class SwitchStatement041 {
public static void main(String[] args) {
	/* 
	 * First Output: "enter the age of the Child"

case 1: if age is 1 print as "You can Crawl"

case 2 : if age is 2 print as  "You can Talk"

case 3: If age is 3 print as "You can Dance"

case 4: if age is 4 print as "You can get  Trouble"

Other than this age (1-4) it should print "I don't know how old you are" 
	 */
	
	Scanner scan=new Scanner(System.in);
	int age;
	String result;
	
	System.out.println("enter the age of the Child");
	age=scan.nextInt();
	
	switch (age) {
	case 1:
		result="You can Crawl";
		break;
	case 2:
		result="You can Talk";
		break;
	case 3:
		result="You can Dance";
		break;
	case 4:
		result="You can get Trouble";
		break;
		default:
			result="I don't know how old you are";}
	System.out.println(result);
	}
}

