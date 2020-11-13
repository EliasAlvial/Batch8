package com.syntax.class21;

public class GrandParents {
   int money;
    GrandParents(){
        System.out.println("Constructor from Grandparents to initialize money");
    }
    GrandParents(int money){
        this.money=money;
    }
    void print(){
        System.out.println(" I have this money "+money);
    }
}
