package com.syntax.class25;

class SmartMachine{
    public void smart(){
        System.out.println("I am a smart machine");
    }
}

public class Computer extends SmartMachine {
    /*
    Define common behavior within and some fields in parent class
    and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array.
    Loop through each object and execute available methods.
     */
    String brand;

    Computer(String brand) {
        this.brand = brand;//using this to differentiate between local and instance variable
    }

    public void run() {
        System.out.println(brand + " can run");
    }

    public void transfer() {
        System.out.println(brand + " can transfer data");
    }

    public void storage() {
        System.out.println(brand + " can store data");
    }
}
    class Apple extends Computer{

        Apple(String brand) {
            super(brand);
        }

        @Override
        public void run() {
            System.out.println("runs faster");
        }

        @Override
        public void storage() {
            System.out.println("Save data in a different way");
        }

        @Override
        public void transfer() {
            super.transfer();
        }
    }
    class Lenovo extends Computer{

        Lenovo(String brand) {
            super(brand);
        }
        void tabletMode(){
            System.out.println(brand+ "Can also be used as tablet");
        }
    }
    class HP extends Computer{

        HP(String brand) {
            super(brand);
        }
        public void security(){
            System.out.println(brand+" Can be unlocked via fingerprints");
        }
    }

