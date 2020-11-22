package com.syntax.class28;

public abstract class WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    String Driver;
    WebDriver(String Driver){
        this.Driver=Driver;
    }
    public abstract void openBrowser();
    public abstract void closeBrowser();
    public abstract void maximizeWindow();
    public abstract void findElement();
}
class ChromeDriver extends WebDriver{


    ChromeDriver(String Driver) {
        super(Driver);
    }

    @Override
    public void openBrowser() {
        System.out.println(Driver+" can open browser");
    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}

