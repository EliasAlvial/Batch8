package com.syntax.class11;

public class Task1 {
public static void main(String[] args) {
	//Create a 2D array where you will store the following values:
	//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	//After storing values print the following:
	//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
	
	String [][] names=new String[4][4];
	
	names[0][0]="Mrs";
	names[0][1]="Mr";
	names[0][2]="Ms";
	names[0][3]="Miss";
	
	names[1][0]="Smith";
	names[1][1]="Obama";
	names[1][2]="Jackson";
	names[1][3]="Jordan";
	
	System.out.println(names[0][0]+" "+names[1][0]);
	System.out.println(names[0][1]+" "+names[1][1]);
	System.out.println(names[0][2]+" "+names[1][2]);
	System.out.println(names[0][3]+" "+names[1][3]);
	
	
	System.out.println("---------------ALT WAY--------------");
	
	String [] [] _array = {{"Mr", "Mrs", "Ms", "Miss",},{"Smith","Jordan", "Jackson", "Obama",}};
	System.out.print(_array[0][1]+" "+_array[1][0]+", ");
	System.out.print(_array[0][0]+" "+_array[1][3]+", ");
	System.out.print(_array[0][2]+" "+_array[1][2]+", ");
	System.out.print(_array[0][3]+" "+_array[1][1]);
	
}
}
