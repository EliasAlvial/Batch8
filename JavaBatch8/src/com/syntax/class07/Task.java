package com.syntax.class07;

public class Task {
public static void main(String[] args) {
	boolean workday=true;
			int day=1;
			while(workday){	
		if(day<=5) {
				System.out.println("I need a day off");
		
		}else{
			System.out.println("I do not need a day off anymore");
			workday=false;
		}
		day++;
			}
			
}
}
