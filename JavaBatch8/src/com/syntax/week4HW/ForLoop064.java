package com.syntax.week4HW;

import java.util.Scanner;

public class ForLoop064 {
public static void main(String[] args) {
	 Scanner inp= new Scanner(System.in);
	    int end, end1;
	    System.out.print("Int:");
	  end=inp.nextInt();
	  end1=(end*2);
	  
	  for(int i=0; i<end1; i++) {
		  System.out.println(i+" ");
	  }
}
}
