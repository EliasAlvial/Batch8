package com.syntax.week2HW;

import java.util.Scanner;

public class ConditionalStatementScannerClass027 {
	public static void main(String[]args){
	    
	    Scanner inp=new Scanner(System.in);
	    System.out.println("Please enter your age");
	    
	    int age=inp.nextInt();
	    
	    if(age>=18){
	      System.out.println("You are eligible to vote");
	    }else{
	      System.out.println("You are not eligble");
	    }
	    
	  }

}
