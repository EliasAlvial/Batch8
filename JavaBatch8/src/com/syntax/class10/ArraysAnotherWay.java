package com.syntax.class10;

public class ArraysAnotherWay {
	public static void main(String[] args) {
		String[]names= {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		
		//String []name;   ---this way does not work
		//name= {"Sabeen"};	}---cont...
		
		System.out.println(names[3]);
		
		//how do I know how many elements I have in array?
		
		int size=names.length;//this is how to find how many elements are listed above
		System.out.println("Size of names array = "+size);
		
		System.out.println(names[names.length-2]);//this is the same way to find what was done in line 10 [Danilo]
		
		int a=2;
		System.out.println(names[a]);//Jack
		a+=2;
		System.out.println(names[a]);//Bryan
		
		for(int i=0; i<names.length; i++)//"names.length" is equal to 6 bc there are 6 names.
			{
			System.out.println(names[i]);
		}
		//for(int i=0; i<=names.length; i++)//can only use this with a -1after names.length
		{
		//System.out.println(names[i]);
	}
}
}
