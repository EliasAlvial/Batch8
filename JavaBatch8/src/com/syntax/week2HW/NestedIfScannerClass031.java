package com.syntax.week2HW;

import java.util.Scanner;

public class NestedIfScannerClass031 { 
	public static void main(String[]args){


    Scanner inp=new Scanner(System.in);
   
    System.out.println("Is it sunny outside?");
    boolean isSunny=inp.nextBoolean();
 
   
   
    if(isSunny) { System.out.println("it is a sunny day, I should go somewhere!");
    System.out.println("What is the tempurature outside?"); 
    int temp=inp.nextInt();
    
	if (temp>85){ System.out.println("I am going to the beach!");
	 
 }else{
	 System.out.println("I am going to the park");
 }}
    
 else {
   	 System.out.println("I stay home and practive Java!");
}
}
}
