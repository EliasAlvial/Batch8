package com.syntax.week3HW;

import java.util.Scanner;

public class SwitchStatement044 {
public static void main(String[] args) {
	/* 
	 * if user enters  BMW -->  carOrigin = "german car"
if user enters  Toyota -->  carOrigin = " japanese car"
if user enters  Maserati -->  carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown" 
 
The output of your program should be:
"Your favorite car is ___"
	 */
	
	Scanner scan=new Scanner(System.in);
	String carOrigin, fav;
	
	System.out.println("Please enter your favorite car make");
	carOrigin=scan.nextLine();
	
	switch (carOrigin) {
	case "BMW":
		fav="german car";
		break;
	case"Toyota":
		fav="japanese car";
		break;
	case "Maserati":
	fav="italian car";
	break;
	default:
		fav="unknown";
	}System.out.println("Your favorite car is "+fav);
}
}
