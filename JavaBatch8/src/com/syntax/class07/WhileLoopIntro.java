package com.syntax.class07;

public class WhileLoopIntro {
public static void main(String[] args) {
	int time=13;
	if(time>12) {//condition is true
		System.out.println("good day");//code executes 1 time
	}
	System.out.println("-----------------While LOOP---------------");
	//13>12-->true
	//while (time>12) {
	//	System.out.println("good day");//INFINITE LOOP
	//	}
	while (time>12) {
		System.out.println("good day");//1 time(because it will decrement to 12
		time--;
	}
	System.out.println("------------Printing numbers 1-50-------------------");
//I want to print numbers 1 to 50
	int num=0;
			while(num<51) {
				System.out.println(num);
				num++;
			}
			System.out.println("-----------Printing 10-60-------------");
			// I want to print 10-50
			int num1=10;
			while(num1<=60) {
				System.out.print(num1+", ");
				num1++;
			}
			
			System.out.println();
			System.out.println("-----------Printing 100-60-------------");
			int b=100;
			while (b>=60) {
				System.out.print(b+", ");
				b--;
			}
			System.out.println();
			//only even numbers
			System.out.println("-----------Printing 10-30-------------");
			int c=10;
			while(c<=30) {
				System.out.print(c+", ");
				c+=2;
			}System.out.println();
			//only even numbers
			System.out.println("-----------Printing 10-30(alt)-------------");
			int d=10;
			while(d<31) {
				if(d%2==0) {
					System.out.print(d+", ");
			}d++;
				
				}System.out.println();
				//only odd numbers
				System.out.println("-----------Printing 100-1-------------");
				int e=100;
				while(e>=1) {
					if(e%2==1) {
							System.out.print(e+", ");
					}e--;
				}System.out.println();
				//only odd numbers
				System.out.println("-----------Printing 100-1 (ALT)-------------");
				int f=99;
				while(f>=1)  {
							System.out.print(f+", ");
					f-=2;}
				
				
					
				
}
}
