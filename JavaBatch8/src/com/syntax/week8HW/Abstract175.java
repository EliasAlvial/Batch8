package com.syntax.week8HW;

public abstract class Abstract175 {
    String teaType;
    abstract void addSugar(String teaType, int a);

}
class Lemon extends Abstract175{
    void Tea(String teaType){
    }

    @Override
    void addSugar(String teaType, int a) {
        this.teaType=teaType;
        System.out.println("For "+teaType+" Tea we need "+a+" spoons of sugar");

    }
}
class Chai extends Abstract175{


    void addSugar(String teaType, int a) {
        this.teaType=teaType;
        System.out.println("For "+teaType+" Tea we need "+a+" spoons of sugar");

    }
}
class Tea{
    public static void main(String[] args) {
        Lemon lemon=new Lemon();
        lemon.addSugar("Lemon",2);
        Chai chai=new Chai();
        chai.addSugar("Chai",1);

    }
}
