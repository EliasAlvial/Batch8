package com.syntax.class07;

public class Review {
public static void main(String[] args) {
	
	String timeOfDay="Morning";
	String day="Saturday";
	switch(timeOfDay){
	case"Morning":
		System.out.println("Good Morning");
	
	switch (day){
	case "Monday":
		System.out.println("Colleague");
		break;
	case "Thursday":
		System.out.println("Asghar");
		break;
	case "Saturday":
		System.out.println("Class");
		break;
	
	}
	//if (day.equals("Saturday")) {
		//System.out.println("Class!");
	//}else if(day.equals("Monday")) {
		//System.out.println("Colleague");
	//}
	break;
	case "Noon":
		System.out.println("Good Afternon");
		break;
	case "Evening":
		System.out.println("Good Evening");
		break;
	case "Night":
		System.out.println("Good Night");
		break;
	case "Saturday":
	System.out.println("Hello Class");
	
	default:
			System.out.println("N/A");
	}
}
}
