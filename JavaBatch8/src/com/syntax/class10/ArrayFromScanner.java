package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {
	public static void main(String[]args) {
		//let's ask user how many names he would like to store and then store said names
		
		Scanner scan;
		String[] names;
		int size;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter number of names you would like to store");
		size=scan.nextInt();
		
		names=new String[size];//since we already initialized the string
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+", ");
		}
		
		
		
		
		
		
	}

}
