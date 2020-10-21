package com.syntax.class09;

public class ArrayDemo {
	public static void main(String[] args) {
		int a = 10;

	//	int student1 = 90;
	//	int student2 = 96;
	//	int student3 = 85;
	//	int student4 = 92;
		
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		
		//to access elements
		System.out.println("Accessing 3rd element "+num[2]);
		System.out.println(num[1]+num[4]);
		
		//I would like to change 50to 100;
		
		num[4]=100;
		System.out.println("value of 5th element after change "+num[4]);
		
		int[] array1=new int[2];
		//array[0]=10.99; CE(Compiler error): type of value must be an integer
		
		String[] array=new String[4];
		array[0]="hello";
		

	}
}
