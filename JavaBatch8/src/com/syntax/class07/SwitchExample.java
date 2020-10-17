package com.syntax.class07;

public class SwitchExample {
	public static void main(String[] args) {
		String month = "March";

		// if month is December --> Feb=winter
		// if month is march-->april=spring
		// if day is Saturday or Sunday-->Java

		switch (month) {
		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;

		}
	}
}
