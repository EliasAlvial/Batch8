package com.syntax.week3HW;

import java.util.Scanner;
public class LogicalOperators035{

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Do you need a loan?");
	boolean ans = scan.nextBoolean();
	int score;
	String result;

	if (ans) {

		System.out.println("What is your credit score?");
		score = scan.nextInt();
		if (score <= 600) {
			result = (" Not eligible");
		} else if (score >= 600 && score <= 700) {
			result = (" Maybe eligible");
		} else if (score>= 701&& score<= 800) {
			result = (" Eligible");
		}else if (score>800){
			result="Definitely eligible";
		}else{
			result=" Unknown";
		}
	} else {
		result = (" Unknown");
	}
	System.out.println("The eligibility is" + result);
}
}

