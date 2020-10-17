package com.syntax.week2HW;
import java.util.Scanner;
public class ConditionStatementScannerClass026 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("in:");
		String name=inp.nextLine();
		
		if(name.equals("Chen")) {
			System.out.println("teacher");
		}else {
			System.out.println("Student");
			
		}
	}

}
