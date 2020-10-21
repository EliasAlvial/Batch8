package com.syntax.class09;

public class PrintingPatternsBestWay {
public static void main(String[] args) {
	for(int i=1; i<=4; i++) {//the outer loops=the amount of rows
		
		for(int c=1; c<=6; c++) {//the inner loop =the amount of col
			System.out.print("*");
		}System.out.println();
	}
	System.out.println("-----------------------");
	for (int i=1;i<=7;i++) {
		for (int c=1; c<=13; c++) {System.out.print("*");
		}System.out.println();
	}
	System.out.println("------------SQUARE OF NUMBERS----------");
	for (int i=1;i<=4;i++) {
		for (int c=1; c<=5
				; c++) {System.out.print(c);
		}System.out.println();
}
	System.out.println("------------SQUARE OF NUMBERS----------");
	for (int i=1;i<=7;i++) {
		for (int c=1; c<=8
				; c++) {System.out.print(i);
		}System.out.println();
}
	System.out.println("------------SQUARE OF NUMBERS decrement----------");
	for (int i=5;i>=1;i--) {
		for (int c=7; c>=1; c--) {System.out.print(c);
		}System.out.println();
}
}
}
