package com.syntax.class05;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		String day="Sunday";
		
		if(day.equals("Saturday")|| day.equals("Sunday"))
		{
			System.out.println("Today I have Java class at Syntax");
		}
			System.out.println("The End");
			
			
			
			
			System.out.println("-----------------------more examples------------------");
			
			/* if day is 1 or 5---> I am off from Syntax
			 * if day 2 or 3 ---> Git class
			 * if day 4 --> Review class
			 * if day 6 or 7 --> Java class
			 */
			
			
			Scanner inp;
			int today;
			inp=new Scanner(System.in);
			
			System.out.println("Please enter today using numbers only");
			
			
			today=inp.nextInt();
			
			if(today==1 || today==5) {
				System.out.println("I have today off");
			}else if(today==2||today==3) {
				System.out.println("Today I have Git class");
			}else if(today==4) {
				System.out.println("today I have Review class");
			}else if(today==6||today==7) {
				System.out.println("Today I have Java class");
			}
			
	}

}
