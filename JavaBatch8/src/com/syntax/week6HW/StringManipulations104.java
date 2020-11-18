package com.syntax.week6HW;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulations104 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        String[] stringArray=s.split(" ");

        for (int i = 0; i < stringArray.length; i++) {

            StringBuilder stringBuilder=new StringBuilder(stringArray[i]);
            stringArray[i]=stringBuilder.reverse().toString();

        }
        System.out.println(Arrays.toString(stringArray));

    }
}
