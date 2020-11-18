package com.syntax.class23;

class Degree{
    String getPrerequisite;

    public void setGetPrerequisite(String getPrerequisite) {
        this.getPrerequisite = getPrerequisite;
    }

    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    public void getPrerequisite(){
        System.out.println("To get a degree you need Bachelors Diploma");
    }
}

public class Task1 {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints "
    "To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        Bachelors obj1=new Bachelors();
        obj1.getPrerequisite();
        Masters obj2=new Masters();
        obj2.getPrerequisite();


    }
}
