package com.syntax.week3HW;

import java.util.Scanner;

public class SwitchStatement043 {
	public static void main(String[] args) {
		/*
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement.
		 * 
		 * case: 1 will display January
		 * 
		 * case: 12 will display December
		 * 
		 * Anything outside of 12 will display "Invalid"
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		String mon;
		System.out.println("input a number between 1-12");
		num = scan.nextInt();

		switch (num) {
		case 1:
			mon = "January";
			break;
		case 2:
			mon = "February";
			break;
		case 3:
			mon = "March";
			break;
		case 4:
			mon = "April";
			break;
		case 5:
			mon = "May";
			break;
		case 6:
			mon = "June";
			break;
		case 7:
			mon = "July";
			break;
		case 8:
			mon = "August";
			break;
		case 9:
			mon = "September";
			break;
		case 10:
			mon = "October";
			break;
		case 11:
			mon = "November";
			break;
		case 12:
			mon = "December";
			break;
		default:
			mon = "invalid";
		}
		System.out.println(mon);

	}
}
