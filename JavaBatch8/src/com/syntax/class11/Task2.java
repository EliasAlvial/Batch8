package com.syntax.class11;

public class Task2 {
public static void main(String[] args) {
	//Create an array of cars :
	//american, german, korean, italian. 
	//And print all values from a 2D array
	
	
	String[][] cars= {
			{"Jeep", "Ford","Dodge"},
			{"Audi", "Porsche", "BMW"},
			{"Kia", "Hyundai", "Hyundai Sontata"},
			{"Ferrari", "Maserati", "Lamborghini"}
			
	};
	
	for(int i=0; i<cars.length;i++) {
		for(int j=0; j<cars[i].length; j++) {
			String car=cars[i][j];
			System.out.print(car+" ");
		}
		System.out.println();
	}
	System.out.println("------------------------------------------");
	
	for(String[]carArray:cars) {
		for(String car:carArray) {
			System.out.print(car+" ");
		}
		System.out.println();
	}
}
}
