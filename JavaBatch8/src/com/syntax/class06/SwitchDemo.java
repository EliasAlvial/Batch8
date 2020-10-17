package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

		/*
		 * lets ask a tester on which browser they would like to use
		 * 
		 */
		String browser, message;
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a browser.");
		browser = inp.nextLine();

		switch (browser.toLowerCase()) {
		case "safari":
			message = "Your code will be executed on safari browser";
			break;
		case "chrome":
			message = "Your code will be executed on chrome browser";
			break;
		case "firefox":
			message = "Your code will be executed on firefox browser";
			break;
		default:
			message = "Entered browser is not supported";
		}
		System.out.println(message);

	}
}
