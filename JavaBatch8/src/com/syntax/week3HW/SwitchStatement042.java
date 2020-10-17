package com.syntax.week3HW;

import java.util.Scanner;

public class SwitchStatement042 {
public static void main(String[] args) {
	/* 
	 * First Output: "enter the roll number of the Child"

case 101: if roll number is 101 print as "Student name:Student name: Ramesh"

case 102 :if roll number is 102 print as "Student name:Student name: Mahesh"

case 103:if roll number is 103 print as "Student name:Student name: Mukesh"

Other than this roll number  it should print "Not found Student name: in Class"
	 */
	
	Scanner scan=new Scanner(System.in);
	int num;
	String name;
	System.out.println("enter the roll number of the Child");
	num=scan.nextInt();
	
	switch(num) {
	case 101:
		name="Student name: Ramesh";
		break;
	case 102:
		name="Student name: Mahesh";
		break;
	case 103:
		name="Student name: Mukesh";
		break;
		default:
			name="Not found Student name: in class";
	}System.out.println(name);
}
}
