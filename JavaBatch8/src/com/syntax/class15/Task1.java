package com.syntax.class15;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(7/2);
        String string="Strings";
        int length=string.length();
        if(!string.isEmpty()){
            if(length>=3&&length%2!=0){
                System.out.println(string.charAt(length/2));
            }
        }
    }
}
