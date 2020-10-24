package com.syntax.class10;

public class MoreArrays {
public static void main(String[] args) {

	char[] grade={'A','B','C','D','E','F','G'};
	char sendValue=grade[1];
	
	String[]names= {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
	String secondValue=names[1];
	
	for(int i=0; i<grade.length; i++) {
		char valueFromArray=grade[i];
		System.out.println(valueFromArray);
	}
	
}
}
