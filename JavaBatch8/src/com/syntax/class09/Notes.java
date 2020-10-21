package com.syntax.class09;

public class Notes {
	public static void main(String[] args) {

		boolean weekend = false;
		int day = 1;
		while (!weekend) {
			System.out.println("I am working");
			if (day >= 6) {
				System.out.println("I am not working!");
				break;

			}
			day++;

		}
		System.out.println("-----------Continue Review----------------");

		for (int i = 1; i <= 5; i++) {
			if (i == 3 && i == 4)// does not skip because "&&" is the wrong input
			{
				continue;

			}
			System.out.println(i + " ");
		}
		System.out.println("-----------Continue Review etc---------------");

		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
				continue;

			}
			System.out.println(i + " ");
		}
		System.out.println("-------------------------------------");

		for (int i = 0; i < 3; i++) {// outer loop
			System.out.println("Hello");
			for (int y = 0; y < 3; y++) {// inner loop
				System.out.println("Bye");
			}
			System.out.println("-----------------------");
		}
		System.out.println("------------MORE EXAMPLES-----------");

		for (int i = 10; i <= 14; i++) {
			System.out.println(i);
			for (int j = 1; j <= 4; j++) {
				System.out.println(j);
			}
			System.out.println("-----------------");
		}
		System.out.println("------------MORE EXAMPLES-----------");

		for (int i = 10; i <= 14; i++) {
			
			for (int j = 1; j <= 4; j++) {
				System.out.println("i="+i+"j="+j);
			}
			System.out.println("-----------------");
		}
		System.out.println("------------how can I print numbers from 10-99 using nested loop-----------");
		
		for(int a=10; a<=99; a+=10 ) {
			
		for (int b=1; b<=9; b++) {
			System.out.println("a="+a+" b="+b);
		}
		}
		System.out.println("-------print international clock-----");
		
		for(int h=00; h<=23; h++) {
		
			for (int m=0; m<=59; m++){
				if(h<10&&m<10) {System.out.println("0"+h+":"+"0"+m);}
				else if (h>10&&m<10) {
						System.out.println(h+":"+"0"+m);
					}
					else if(h<10&&m<10) {
						System.out.println("0"+h+":"+m);
					}else {
						System.out.println(h + ":" + m);
					}
					
				}
				
			}
			
			
	}

}
