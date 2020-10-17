package com.syntax.class05;

import java.util.Scanner;

public class task3 {
public static void main(String[] args) {
	
	/* 
	 * I need to define whether a number that is entered from user
	 * small number is between 1-10
	 * medium number is a number between 11 to 100
	 * large number is a number between 101 to 1000
	 */

	Scanner input;
	int num;
	
	input=new Scanner(System.in);
	System.out.println("Please enter any number between 1-1000");
	num=input.nextInt();

if(num>0 && num<=10) {
	System.out.println("You entered a small number");
}else if(num>10 && num<=100){
	System.out.println("You entered a medium number");
	
}else if(num>100 && num<=1000) {
	System.out.println("You entered a large number");
}
	
}

}
