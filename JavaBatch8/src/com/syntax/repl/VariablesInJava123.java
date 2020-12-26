package com.syntax.repl;

public class VariablesInJava123 {
//    void year(int a){
//        System.out.println(a);
//    }
//    void schoolName(String b){
//        System.out.println(b);
//    }
//    void batch(int c){
//        System.out.println(c);
//    }
//    public static String schoolName="Syntax";
//   public static int year=2020;
//    public static int batch=6;
//
//    public static void main(String[] args) {
//        System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
//    }

    int batch;
    String schoolName;
    int year;

    public static void main(String[] args) {
        VariablesInJava123 mm= new VariablesInJava123();
        mm.batch=6;
        mm.schoolName="Syntax";
        mm.year=2020;
        System.out.println("I am a student of batch "+mm.batch+" studying at "+mm.schoolName+" in the year of "+mm.year);
    }

}
