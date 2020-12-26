package com.syntax.repl;

public class VariablesInJava124 {
     void numa(int numa){
        System.out.println(numa);
    };
    void doub(double doubl){
        System.out.println(doubl);
    };
    void cha(char cha){
        System.out.println(cha);
    };
    public static void main(String[] args) {
        VariablesInJava124 mm=new VariablesInJava124();
        mm.numa(10);
        mm.doub(10.23);
        mm.cha('a');
        mm.numa(100);
        mm.doub(100.23);
        mm.cha('s');

    }
    //syntax version
    //    int intValue;
    //    double doubleValue;
    //    char charValue;
    //
    //  public static void main(String[] args) {
    //
    //      Main mm= new Main();
    //      mm.intValue=10;
    //      mm.doubleValue=10.23;
    //      mm.charValue='a';
    //      System.out.println(mm.intValue);
    //      System.out.println(mm.doubleValue);
    //      System.out.println(mm.charValue);
    //
    //      Main mm1= new Main();
    //      mm1.intValue=100;
    //      mm1.doubleValue=100.23;
    //      mm1.charValue='s';
    //      System.out.println(mm1.intValue);
    //      System.out.println(mm1.doubleValue);
    //      System.out.println(mm1.charValue);
    //  }
}
