package com.syntax.class25;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] allComputersInSingleVar={new Apple("Apple"),
                new Lenovo("Lenova"), new HP("Brand")};//by making this array I do not need to make code for these three
        //because of polymorphism

        for (Computer computer:allComputersInSingleVar){
            computer.run();
            computer.storage();
            computer.transfer();
        }
        Lenovo lenova=new Lenovo("Lenova");
        lenova.tabletMode();//If I didn't create these for all 3 classes
    }

}
