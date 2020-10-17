package com.syntax.week3HW;

import java.util.Scanner;

public class SwitchStatement045 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int day1;
		String day2;

		System.out.println("Input a number between 1-7");
		day1 = scan.nextInt();

		switch(day1) {
		case 1:
			day2="Monday";
			break;
		case 2:
			day2="Tuesday";
			break;
		case 3:
			day2="Wednesday";
			break;
		case 4:
			day2="Thursday";
			break;
		case 5:
			day2="Friday";
			break;
		case 6:
			day2="Saturday";
			break;
		case 7:
			day2="Sunday";
			break;
			default:
				day2="invalid";
				
		}System.out.println(day2);
	}
}
