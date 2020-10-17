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
	while (time>9) {
		System.out.println("good day");//1 time
		time--;
	}
}
}
