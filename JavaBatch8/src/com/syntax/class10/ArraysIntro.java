package com.syntax.class10;

public class ArraysIntro {
public static void main(String[] args) {
	//I have 5 students in the class and I need to calculate the average score
	
	int[] grades=new int[5];
	grades[0]=98;
	grades[1]=80;
	grades[2]=89;
	grades[3]=67;
	grades[4]=77;
	
	int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
	
	System.out.println("Average score of my students ="+average);
	
	int a=10;//examples of storing variables...basic
	int b;
	b=10;
	System.out.println("-------------------------------------------");
	
	double[] array;
	
	array=new double[3];
	array[0]=12.99;
	array[1]=10.89;
	
	System.out.println("Value of last element"+array[2]);
	array[2]=5.99;
	System.out.println("Value of last elemtn"+array[2]);
	array[3]=7;
	
	
	String[] liquid=new String[4];
	liquid[2]="Water";
	liquid[1]="Tea";
	System.out.println(liquid[0]);
	
	
	}
}

