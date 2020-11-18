package com.syntax.week6HW;

public class StringManipulations102 {
    public static void main(String[] args) {
        /*
        Create a String given="Hello Syntax friends".
        Using String methods from given String create new String "Welcome Syntax family"
         */
        String given="Hello Syntax friends";

        String[][] replacements = {{"Hello", "Welcome"},
                {"friends", "family"}};
        CharSequence s1="Hello";
        CharSequence s2="Welcome";
        CharSequence s3="friends";
        CharSequence s4="family";


        String strOutput = given;
        for(String[] replacement: replacements) {
            strOutput = strOutput.replace(replacement[0], replacement[1]);
        }

        System.out.println(strOutput);


    }
}
