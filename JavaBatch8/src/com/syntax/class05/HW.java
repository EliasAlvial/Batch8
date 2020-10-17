package com.syntax.class05;

import java.util.Scanner;

public class HW {
public static void main(String[] args) {
	/* 
	 * You are working in sales and have to calculate commission for the employees;
	 * You need to ask user a sales amount and based on the amount you need to define their commission
	 * if user sold products for more than $10 but less than 100 --> commission is 10%
	 * if sales is more than 100 but less then 200 --> commission is 20%
	 * if sales is more than 200 but less then 500 --> commission is 30%
	 * if sales is more than 500 --> commission is 50%
	 * You program should print How much in commission user will get
	 */
	
	Scanner inp;
	double sales, com;
	
	inp=new Scanner(System.in);
	
	System.out.println("Please enter your sales amount");
	sales=inp.nextInt();
	
	if(sales>=10&&sales<=100) {
		com= sales*.1;
	}else if(sales>=101&&sales<=199) {
		com=sales*.2;
	}else if(sales>=201&&sales<=499) {
		com=sales*.3;
	}else if(sales>=500) {
		com=sales*.5;
	}else {
		com=0;
	}
	System.out.println("Your commision is $" +com);
}
}
