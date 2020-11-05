package com.syntax.week5HW;

import java.util.Scanner;

public class Arrays079 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String array [];
        int size=8;
        array=new String[size];
        for (int i = 1; i <size ; i++) {
            System.out.println("Please enter day "+i+" of the week");
            array[i]=scan.next();

        }
        for (int i = 1; i < array.length ; i++) {
            System.out.println(array[i]);

        }

    }
}
