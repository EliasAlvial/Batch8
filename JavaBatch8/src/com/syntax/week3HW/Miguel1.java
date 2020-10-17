package com.syntax.week3HW;

import java.util.Scanner;

public class Miguel1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	     int score;
	     String grade;
	     System.out.println("Please enter your mark");
	     score = input.nextInt();
	     
	     if(score>=1 &&score<=100) 
	     if(score>=1 && score<25){
	       grade = "F";
	     }else if(score>=25 && score<45){
	       grade = "E";
	     }else if(score>=45 && score<50){
	       grade = "D";
	     }else if(score>=50 && score<60){
	       grade = "C";
	     }else if(score>=60 && score<80){
	       grade = "B";
	     }else if(score>80){
	       grade = "A";
	     }else {
	    	 grade= "please enter vaild mark";}
	     System.out.println("Your grade is "+grade);
	     }
	}


