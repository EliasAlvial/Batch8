package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {
public static void main(String[] args) {
	Scanner scan;
	int num1;
	int num2=7;
	
	scan=new Scanner(System.in);//have to figure out number before it can be pun it "while"
	System.out.println("Please enter any number between 1-100");
	num1=scan.nextInt();//
	
	while(num1!=num2) {
		System.out.println("Please enter any number between 1-100");
		num1=scan.nextInt();
	}
	System.out.println("Congratulations");
	
}
}
