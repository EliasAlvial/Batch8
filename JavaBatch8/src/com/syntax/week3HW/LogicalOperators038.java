package com.syntax.week3HW;

import java.util.Scanner;

public class LogicalOperators038 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean inp;
		String subject;
		System.out.println("Is it the weekend?");
		inp=scan.nextBoolean();
		
		if(inp) {
			subject="Manual testing";
		}else {
			subject="Java";
		}System.out.println("Today you will be learning "+subject);
		
	}

}
