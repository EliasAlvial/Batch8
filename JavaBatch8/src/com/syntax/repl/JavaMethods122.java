package com.syntax.repl;

public class JavaMethods122 {
String a;
char b;
    void censorLetter(String a,char b){
//        this.a=a;
//        this.b=b;
       String  censorLetter=a.replace(b,'*');
        System.out.println(censorLetter);

    }

    public static void main(String[] args) {
        JavaMethods122 javaMethods122=new JavaMethods122();
        javaMethods122.censorLetter("computer science",'e');
        javaMethods122.censorLetter("trick or treat",'t');

    }
}
