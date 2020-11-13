package com.syntax.class21;

public class MoneerClass extends ParentClass{
    int money;
    MoneerClass(int money) {
        super(money);

    }
   /*MoneerClass(int money){
      // super(money);
       System.out.println("From Child");
   }*/

    void marry(){
        super.marry();//applying superclass here allows us to use both the parent and Moneer methods.
        System.out.println(" I will marry katrina okay go mary her, here is the money "+super.money);
    }

    public static void main(String[] args) {
        MoneerClass moneerClass=new MoneerClass(1000);
        moneerClass.marry();
    }
}
