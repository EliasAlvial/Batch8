package com.syntax.GroupTask;

public class Task7 {
	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

				int [][] odd = {
						{2,4,6,8},
						{1,3,5,7},
						{20,21,22,23},
						{111,69,46,88}
						};
						for(int[] odds:odd) {
							for(int number:odds) {
								if(number%2==0) {
									System.out.print(number+" ");
								}
							}
						}
	}
}
