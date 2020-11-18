package com.syntax.class23;

public class DaniloFamilyTester {
    public static void main(String[] args) {

        DaniloParents daniloParents = new Danilo();

        Danilo danilo = new Danilo();

        Jelena jelena = new Jelena();
        Milos milos = new Milos();

        DaniloParents[] familyArray = new DaniloParents[3];
        familyArray[0] = new Danilo();
        familyArray[1] = new Jelena();
        familyArray[2] = new Milos();

        //traditional approach
        print(danilo, jelena, milos);
        //advance polymorphism approach
        System.out.println("--------------------------------");
        print(familyArray);

    }


    public static void print(Danilo danilo, Jelena jelena, Milos milos){
        danilo.eat();
        danilo.sleep();
        jelena.eat();
        jelena.sleep();
        milos.eat();
        milos.sleep();
    }
    public static void print(DaniloParents[] daniloParent){
        for(DaniloParents dp:daniloParent){
            dp.eat();
            dp.sleep();
        }
       /* daniloParents.eat();
        daniloParents.sleep();
        daniloParents=new Jelena();
        daniloParents.eat();
        daniloParents.sleep();
        daniloParents=new Milos();
        daniloParents.eat();
        daniloParents.sleep();
       // double var=10;///double can have mutliple variables just like DaniloParent can as weel.
        */
    }
}
