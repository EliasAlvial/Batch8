package com.syntax.GroupTask;

public final class Task1 {
public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
	
	int x = 1;
	int y = 2;
	
	System.out.println("Before swap " + x + " " + y);
	
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("x = "+x+" and y = "+y);

}
}
