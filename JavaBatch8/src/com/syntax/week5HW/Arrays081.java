package com.syntax.week5HW;

import java.util.Scanner;

public class Arrays081 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[];
        int size = 5;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();

        }
        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i]*10);
        }
    }
}
