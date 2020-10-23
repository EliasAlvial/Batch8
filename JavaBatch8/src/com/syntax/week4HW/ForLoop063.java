package com.syntax.week4HW;

import java.util.Scanner;

public class ForLoop063 {
public static void main(String[] args) {
	

	Scanner inp= new Scanner(System.in);
    int x;
   System.out.print("In:");
   //write code under on step 8
   x=inp.nextInt();
   for(int i=0; i<x; i++) {
	   System.out.print(i+" ");
   }
}
}