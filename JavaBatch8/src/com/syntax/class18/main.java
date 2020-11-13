package com.syntax.class18;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("In:");
        String word=inp.nextLine();
        for (int i = 0; i <word.length(); i++) {
            if(word.contains("aeiou")){
                System.out.println(word);
            }

        }
    }
}
