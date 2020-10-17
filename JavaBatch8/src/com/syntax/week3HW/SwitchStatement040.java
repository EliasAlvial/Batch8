package com.syntax.week3HW;

import java.util.Scanner;

public class SwitchStatement040 {
	public static void main(String[] args) {
		/*
		 * First Output: "Enter name of the instructor"
		 * 
		 * case 1: if User provided the name as Asghar as input it should show
		 * "Will take care of Java Assignment" case 2: if User provided the name as
		 * Moazam as input it should show "Will take care of SDLC Assignment" case 3: if
		 * User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment"
		 * 
		 * Other than these four names if the user provides any other names -->
		 * " Invalid instructor selected"
		 */

		Scanner scan = new Scanner(System.in);

		String inst, out;
		System.out.println("Enter name of the instructor");
		inst = scan.nextLine();

		switch (inst) {
		case "Asghar":
			out = "Will take care of Java Assignment";
			break;
		case "Moazam":
			out = "Will take care of SDLC Assignment";
			break;
		case "Weqas":
			out = "Will take care of Selenium Assignment";
			break;
		case "Asel":
			out = "Will take care of every Assignment";
			break;
		default:
			out = "Invalid instructor selected";}
			System.out.println(out);

	}
}
