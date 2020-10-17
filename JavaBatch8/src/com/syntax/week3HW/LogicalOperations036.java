package com.syntax.week3HW;

import java.util.Scanner;

public class LogicalOperations036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String word1, word2, output;
		int int1, int2;
		
		System.out.println("Please enter two strings");
		word1=scan.nextLine();
		word2=scan.nextLine();
		
		System.out.println("Please enter two numbers");
		int1=scan.nextInt();
		int2=scan.nextInt();
		
		
		if(word1.equals(word2)&int1==int2) {
			output="AND";
		}else if(word1.equals(word2)|int1==int2){
			output="OR";
		}else if(word1!=word2|int1!=int2){
			output="NONE";
		}else{
			output="NONE";}
			System.out.println(output);
		}
	}

