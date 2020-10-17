package com.syntax.week3HW;

import java.util.Scanner;

public class LogicalOperators037 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	boolean thirsty, sleepy;
	String drink;
	System.out.println("Are you thristy?");
	thirsty=scan.nextBoolean();
	
	System.out.println("Are you sleep?y");
	sleepy=scan.nextBoolean();
	
	if(thirsty&&!sleepy) {
		drink="Water";
	}
	else if(thirsty&&sleepy) {
		drink="Coffee";
	
	}
	else if(!thirsty&&sleepy){
		drink="Tea";
	}else {
		drink="Nothing";
	}System.out.println("Looks like you need to drink "+drink);
}
}
