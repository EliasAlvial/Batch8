package com.syntax.reviewclass03;

import java.util.Scanner;

public class NestingIf {
public static void main(String[] args) {
	
	String pass;
	double accountBalance=100;
	Scanner scan=new Scanner(System.in);
	double transferAmount;
	System.out.println("Welsome to Syntax Please Enter your password");
	pass=scan.nextLine();
	
	if("pass123".equals(pass) || pass.equals("pass123")) {
		System.out.println("Please enter the amount you would like to transfer");
		transferAmount=scan.nextDouble();
	
	}
}
}
