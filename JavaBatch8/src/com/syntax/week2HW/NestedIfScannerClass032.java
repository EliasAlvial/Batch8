package com.syntax.week2HW;

import java.util.Scanner;

public class NestedIfScannerClass032 {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		char name=inp.next().charAt(0);
		
		System.out.println("Please enter your age");
		int age=inp.nextInt();
		
		if(name=='F') {
			if(age<25) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
				
			}
		} if(name=='M'){
			if(age<25) {
				System.out.println("boy");
			}
			else {
				System.out.println("Man");
			}
			
		}
		

	}

}
