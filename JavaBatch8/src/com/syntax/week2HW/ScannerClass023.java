package com.syntax.week2HW;

import java.util.Scanner;

public class ScannerClass023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input the boolean value");
		
		boolean ans=input.nextBoolean();
		
		if(ans) {
			System.out.println("The value is true");
		}else {
			System.out.println("The value is false");
		}
		

	}

}
