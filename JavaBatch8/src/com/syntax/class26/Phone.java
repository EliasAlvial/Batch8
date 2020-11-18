package com.syntax.class26;

import com.syntax.class21.Parent;

abstract public class Phone {
    public void makeCalls(){
        System.out.println("phone makes call");
    }
    public void SendText(){
        System.out.println("Phone send txt");
    }
    public abstract void viewPicture();//by putting "abstract" we are leaving the responsibility to the child class
    public abstract void unlock();
}
abstract class Iphone extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("We can checkout the photos using the photos app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock with face");
    }
}
class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("to view pictures use the Gallery app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock the password");
    }
}