package com.syntax.class23;

class CreditCard{
    double Balance;


    public CreditCard(double Balance){
        this.Balance=Balance;
    }
    void printInterestFee(){
        System.out.println("Interest Fee "+Balance*0.01);
    }
}
class Visa extends CreditCard{

    public Visa(double Balance) {
        super(Balance);
    }
}
class AX extends CreditCard{

    public AX(double Balance) {
        super(Balance);
    }
    public void printInterestFee(){
        System.out.println("Interest Fee "+Balance*0.1);
    }
}

public class Task2 {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        Visa visa=new Visa(100000);
        visa.printInterestFee();
        AX ax=new AX(100000);
        ax.printInterestFee();
    }

}
