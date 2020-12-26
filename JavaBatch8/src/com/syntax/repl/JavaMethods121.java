package com.syntax.repl;

public class JavaMethods121 {
    void spaceOut(String a){
        StringBuilder sb = new StringBuilder();

        for (char c: a.toCharArray()) {
            sb.append(c).append(" ");
        }

        System.out.println(sb.toString().trim());


    }

    public static void main(String[] args) {
        JavaMethods121 mm=new JavaMethods121();
        mm.spaceOut("Jacob");
    }
}
