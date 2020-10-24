package com.syntax.class11;

public class Mig {
	public static void main(String[] args) {
		String[][] names = { { "Mr", "Mrs", "Ms", "Miss", }, { "Smith", "Jordan", "Jackson", "Obama" } };

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);
	


	String[][] cars = {
				{"Jeep", "Ford", "Dodge"},
				{"Audi", "Porsche", "BMW"},
				{"Kia", "Hyundai", "Hyundai Sonata"},
				{"Ferrari", "Maserati", "Lamborghini"}
				};

	for(
	int i = 0;i<cars.length;i++)
	{
		for (int j = 0; j < cars[i].length; j++) {

			String car = cars[i][j];
			System.out.println(car + "   ");
		}
		System.out.println();

	}
		System.out.println("---------------------------------------------");

	for(String[] carArray:cars) {
			
		for(String car:carArray) {
				System.out.println(car+" ");
	}
		System.out.println();
  }
	}

}
