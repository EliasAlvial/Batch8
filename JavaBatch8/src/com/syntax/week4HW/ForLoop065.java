package com.syntax.week4HW;

import java.util.Scanner;

public class ForLoop065 {
public static void main(String[] args) {
	Scanner inp= new Scanner(System.in);
	int x;
	System.out.println("In:");
	x=inp.nextInt();
	
	for(int i=(x-1); i>=0; i--) {
		System.out.println(i);
	}
}
}
