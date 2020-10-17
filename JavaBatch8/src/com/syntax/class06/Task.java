package com.syntax.class06;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Please tell me if there is a sale today.");
	boolean sale=inp.nextBoolean();
	double price, discount;
	if(!sale) {
		System.out.println("no Shopping");
	}else 
		System.out.println("please tell me the price");
		price=inp.nextDouble();{
	if(price>=10&& price<50) {
		discount=price*.1;
	}else if(price>=50&&price<=100) {
		discount=price*.2;
		
	}else if(price>=100 && price<500) {
		discount=price*.4;
	}else if(price>=500) {
		discount=price*.5;
	}else {
		discount=0;
	}
	
}double finalPrice=price-discount;
		System.out.println("your discount is " +discount);
System.out.println("Your final price will be " +finalPrice);
}
}

