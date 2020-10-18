package com.syntax.class08;

public class ForLoopDemo {
public static void main(String[] args) {
	//I want to say Good morning 5 times
	
	for(int i=1; i<=5; i++)//this only works when we know exactly how many times we want input stated 
		{
		System.out.print("Good Morning"+", ");
	}
System.out.println();
	System.out.println("-------I want to print numbers 1 to 100--------");
// I want to print number 1-100
	for( int a=1; a<=100; a++) {
		System.out.print(a+", ");
	}

	System.out.println();
	System.out.println("----I want to print numbers 10 to 1-----------");	
	
for(int b=10; b>=0; b--) //all instances inside parenthesis must be true to execute
{
	System.out.print(b+", ");
}
System.out.println();
System.out.println("----What will be the output-----------");	
	
for (int c=0;c<=30; c+=3) {
	System.out.print(c+ ", ");
}
}

}
