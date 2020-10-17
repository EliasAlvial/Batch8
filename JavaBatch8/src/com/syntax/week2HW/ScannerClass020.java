package com.syntax.week2HW;

import java.util.Scanner;

public class ScannerClass020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);

		String firstName;
		
		//Enter first name and press Enter
		System.out.println("Please First Name");
		
		firstName=input.nextLine();
		
		String Sirname;
		
		System.out.println("Please Sir Name");
		Sirname=input.nextLine();
		
		
		System.out.println("firstName" + "Sirname");

	}

}
