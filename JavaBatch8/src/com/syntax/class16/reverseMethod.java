package com.syntax.class16;
import java.util.Arrays;


public class reverseMethod {
    public static void main(String[] args) {
        //reverse all of the words in a sentence
        String sentence="What did u use the most?";//We can not perform reverse with string class
        String[] stringArray=sentence.split(" ");//this step needs to tak place before we convert to StringBuilder
        System.out.println(Arrays.toString(stringArray));//we need to put Arrays.toString to seperate the words when we print them

        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder stringBuilder=new StringBuilder(stringArray[i]);//that is why we need to convert to StringBuilder
            //System.out.println(stringBuilder);//this will have the words print one by one
            stringArray[i]=stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(stringArray));
            
        }
    }

