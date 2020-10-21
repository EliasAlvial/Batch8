package com.syntax.class08;

public class NestedLoops {
public static void main(String[] args) {
	
	for(int i =1; i<3; i++) {
		System.out.println("I am an outer loop");
		for(int y=0; y<=3; y++) {
			System.out.println("I am an iner loop");
		}
	}System.out.println("Skadoosh");
}
}
