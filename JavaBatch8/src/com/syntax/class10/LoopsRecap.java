package com.syntax.class10;

public class LoopsRecap {
public static void main(String[] args) {
	
	
	boolean condition=true;
	while(condition) {
		System.out.println("I am 'while' loop");
		for(int i=1; i<8; i++) {
			System.out.println("I am 'for' loop");
		}break;
	}
	System.out.println("----------------------------------");
	for(int i=1; i<=3; i++) {
		System.out.println("I am 'for' loop");
		while(condition) {
			System.out.println("I am 'while' loop");
			break;
		}
	}
}
}
