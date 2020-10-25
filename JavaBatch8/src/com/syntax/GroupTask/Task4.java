package com.syntax.GroupTask;

public class Task4 {
	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] array = {25, 3, 0, 12, -11, 88, 65};
		
		
		int max = array[0];
		int min = array[0];
		
		
		for (int i = 1; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
			}
			
			
		}
		
		for (int i = 1; i < array.length; i++) {
			
			if (array[i] < min) {
				min = array[i];
			}
			
			
		}
		
		System.out.println("The largest number from an array is " + max);

		System.out.println("The smallest number is: " + min);



	}
}
