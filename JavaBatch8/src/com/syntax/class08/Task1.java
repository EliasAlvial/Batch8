package com.syntax.class08;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	
	System.out.println("------------Print number 1-100-----------");
	for(int num=1; num<=100; num++) {
		System.out.print(num+", ");
	}
	System.out.println();
	System.out.println("----Print numbers from 100 to 1-------");
	for(int num=100; num>=0; num--) {
		System.out.print(num+", ");
	}
	System.out.println();
	System.out.println("--------Print even numbers from 20 to 1 (2 ways)----------");
	
	for (int num=20; num>=0; num-=2) {
		System.out.print(num+", ");
		
	}
	System.out.println();
	int d=20;
	while(d>=0) {
		if(d%2==0) {
			System.out.print(d+", ");
	}d--;
	}
System.out.println();	
System.out.println("---------Print odd numbers between 20 and 50 (2 ways)-------");
for(int num=21; num<=50; num+=2) {
	System.out.print(num +", ");
}
System.out.println();
int a=20;
while(a<=50) {
	if(a%2==1) {
		System.out.print(a+", ");
		}a++;
}

System.out.println();
System.out.println("----------what till be the output---------------");
int result=1;

for(int i=10; i>=1; i-=2) {
	result*=i;
	System.out.println("result =" +result);
}

System.out.println("-----------Result odd numbers------------");
//calculate sum of even and odd numbers from range 1 to 50

int result2=0;
for (int i=1; i<=50; i+=2) {
	result2= result2+i;
	System.out.println("Result =" +result2);
}
System.out.println("--------Result even numbers---------");
int result3=0;
for (int i=0; i<=50; i+=2) {
	result3= result3+i;
	System.out.println("Result =" +result3);
}
System.out.println("-----------both results---------");
int sumA =0;
int sumB=0;
for (int i = 1; i <= 50; i++) {
	if (i % 2 == 0) {
		sumB+=i;
	} else {
		sumA+=i;
	}
	
}
System.out.println("The sum of even numbers 1 to 50 is "+ sumB);
System.out.println("The sum of odd numbers 1 to 50 is "+ sumA);


System.out.println("________________________");
// I want to create a multiplication table
/*
 * 1x1=1
 * 1x2=2
 * 1x3=3
 */
int num1=1;//This will be the multiplication table indicator
int mult;
for (int i=1; i<=10;i++) {
	mult=num1*i;
	System.out.println(num1+"x"+i+"="+mult);
}
System.out.println("________________________");
Scanner scan=new Scanner(System.in);
System.out.println("Please enter number");
int num2=scan.nextInt();
int mult1;
for (int i=1; i<=10;i++) {
	mult1=num2*i;
	System.out.println(num1+"x"+i+"="+mult1);

}
}
}
