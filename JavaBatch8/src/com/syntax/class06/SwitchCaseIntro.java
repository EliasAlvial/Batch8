package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {
	public static void main(String[] args) {

		Scanner inpt = new Scanner(System.in);
		System.out.println("Please enter what day it is");
		int day = inpt.nextInt();

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Toay is Tuesday we have Manual class");

		} else if (day == 3) {
			System.out.println("Today is Wednesday we have Manual class");
		} else if (day == 4) {
			System.out.println("Today is Thursday we have Review class");

		} else if (day == 5) {
			System.out.println("Today is Friday and we do not have class");
		} else if (day == 6) {
			System.out.println("Today is Saturday and I have Java class today");
		} else if (day == 7) {
			System.out.println("Today is Sunday and I have Java class today");
		} else {
			System.out.println("This is an invalid day of the week");
		}
		System.out.println("------------same example-----");
		String today;
		switch (day) {//datatype of variable must match the datatype of 
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today="Invalid Day";
			
			

		}
		System.out.println("today is "+today);

	}
}
