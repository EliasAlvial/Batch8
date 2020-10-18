package com.syntax.class08;

import java.util.Scanner;

public class RecapWithDoWhile {
	public static void main(String[] args) {
		Scanner input;
		int money;
		int waterPrice = 5;

		input = new Scanner(System.in);
		System.out.println("Please pay for your water!");


		do {
			money = input.nextInt();//input needs to be in "do" so if correct the first time it will register
			if (money > waterPrice) {
				System.out.println("This is too much water, you need to enter less amount");
				// money=input.nextInt();
			} else if(money<waterPrice) {
				System.out.println("water is expensive, please insert more money");
				// money=input.nextInt();
			}
			//money = input.nextInt();

		} while (money != waterPrice);
		System.out.println("enjoy your water");
	}
}
