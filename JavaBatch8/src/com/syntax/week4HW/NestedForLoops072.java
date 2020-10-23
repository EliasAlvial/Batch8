package com.syntax.week4HW;

public class NestedForLoops072 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==2&&j==2) {
					System.out.print(" ");
					continue;
				}if(i==2&&j==3) {
					System.out.print(" ");
					continue;
				}if(i==3&&j==2) {
					System.out.print(" ");
					continue;
				}if(i==3&&j==3) {
					System.out.print(" ");
					continue;
				}
				System.out.print("$");
			}System.out.println();
		}
	}

}
