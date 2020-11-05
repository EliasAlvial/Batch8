package com.syntax.class15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String momsName, dadsName, gender, babyName;
        System.out.println("Please enter dads name");
        dadsName=scanner.nextLine();
        System.out.println("Please enter momsName");
        momsName=scanner.nextLine();
        System.out.println("Is is a boy or girl?");
        gender=scanner.nextLine();
        if(gender.toLowerCase().startsWith("b")){
            babyName=((dadsName.substring(0,dadsName.length()/2))+(momsName.substring(momsName.length()/2)));
        }

    }
}
