package com.syntax.week2HW;
import java.util.Scanner;
public class NestedIfScannerClass033 {

	public static void main(String[]args){
	    
	    Scanner inp=new Scanner(System.in);
	    System.out.println("Please enter any number");
	    Long num=inp.nextLong();
	    
	   if ( num % 2 == 0 ){
	        System.out.println("Entered number is even");
	        if (num>1000){
	          System.out.println("Even value is large");
	        }else{
	          System.out.println("Even value is just right");
	        }}
	     else
	        System.out.println("Entered number is odd");
	  }
	    
	  }


