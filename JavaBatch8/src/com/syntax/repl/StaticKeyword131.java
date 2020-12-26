package com.syntax.repl;

public class StaticKeyword131 {

static void display(String countryName, String continent){
    System.out.println(countryName+" located on "+continent+" continent");
}
    public static void main(String[] args) {
        StaticKeyword131 mm=new StaticKeyword131();
       mm.display("Morocco","Africa");

    }
    //  Syntax version
    //  static String country, continent;
    //
    //	static void display() {
    //		System.out.println(country+" located on "+continent+" continent");
    //	}
    //
    //	public static void main(String[] args) {
    //
    //		country="Morocco";
    //		continent="Africa";
    //		display();
    //
    //	}
}
