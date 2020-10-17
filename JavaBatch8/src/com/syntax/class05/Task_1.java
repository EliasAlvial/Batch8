package com.syntax.class05;

import java.util.Scanner;

public class Task_1 {
public static void main(String[] args) {
	/* 
	 * Write a program that will read three inputes of scores(quiz, misterm, and final score)
	 * Determine the grade on the following rules:avg score>==90->A, >==80-->B, >==70-->C, <50-->F
	 * 
	 */
	Scanner inp;
	int quiz, mid, finalScore, avg;
	char grade;
	inp=new Scanner(System.in);
	
	System.out.println("Please enter quiz score");
	quiz=inp.nextInt();
	System.out.println("Please enter midterm score");
	mid=inp.nextInt();
	System.out.println("Please enter final score");
	finalScore=inp.nextInt();
	
	avg=(quiz+mid+finalScore)/3;
	System.out.println(avg);
	
	
	if (avg>=90) {
		grade='A';	
	}else if(avg<=89&&avg>=80) {
		grade='B';
	}else if(avg<=79&&avg>=70) {
		grade='C';
	}else  if(avg<=69&&avg>=60) {
		grade='D';
	}else{
		grade='F';
	}
	
	System.out.println("Grade= "+grade);
	
	
	if(grade=='A'||grade=='B') {
		System.out.println("Congratualtion you did well in the course");
	}else {
		System.out.println("You need to work harder");
	}
	
	
}
}
