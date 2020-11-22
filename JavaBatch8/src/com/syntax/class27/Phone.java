package com.syntax.class27;

public abstract class Phone {
    public void calls(){
        System.out.println("can make calls");
    }
    public void text(){
        System.out.println("can send texts");
    }

    public abstract void takePictures();
    public abstract void playMusic();

    }
class Iphone extends Phone{
    public void takePictures(){
        System.out.println(" Can take good pictures in low light");
    }

    @Override
    public void playMusic() {

    }
}
