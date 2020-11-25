package com.syntax.DaddyChill;

 public interface WebDriver {
     void open();
     void close();
    String getTitle(String Title);
     }
interface TakesScreenshot{
 void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    static String Title;
     @Override
    public void open() {
        System.out.println("Open with "+Title);
    }

    @Override
    public void close() {
        System.out.println("Close with "+Title);
    }


    @Override
    public void getScreenshot() {
        System.out.println("Screenshot with "+Title);
    }

    @Override
    public void navigate() {
        System.out.println("navigate with "+Title);
    }

    @Override
    public String getTitle(String Title) {
        this.Title=Title;
        return Title;
    }
}
class FirefoxDriver implements RemoteWebDriver{
    static String Title;
    @Override
    public void open() {
        System.out.println("Open with "+Title);
    }

    @Override
    public void close() {
        System.out.println("Close with "+Title);
    }


    @Override
    public void getScreenshot() {
        System.out.println("Screenshot with "+Title);
    }

    @Override
    public void navigate() {
        System.out.println("navigate with "+Title);
    }

    @Override
    public String getTitle(String Title) {
        this.Title=Title;
        return Title;
    }
}
class SafariDriver implements RemoteWebDriver{
    static String Title;
    @Override
    public void open() {
        System.out.println("Open with "+Title);
    }

    @Override
    public void close() {
        System.out.println("Close with "+Title);
    }


    @Override
    public void getScreenshot() {
        System.out.println("Screenshot with "+Title);
    }

    @Override
    public void navigate() {
        System.out.println("navigate with "+Title);
    }

    @Override
    public String getTitle(String Title) {
        this.Title=Title;
        return Title;
    }
}
class main{
    public static void main(String[] args) {
        RemoteWebDriver chrome=new ChromeDriver();
        RemoteWebDriver firefox=new FirefoxDriver();
        RemoteWebDriver safari=new SafariDriver();

        chrome.getTitle("Chrome");
        chrome.open();
        chrome.close();
        chrome.getScreenshot();
        chrome.navigate();
        firefox.getTitle("Firefox");
        firefox.open();
        firefox.close();
        firefox.getScreenshot();
        firefox.navigate();
        safari.getTitle("Safari");
        safari.open();
        safari.close();
        safari.getScreenshot();
        safari.navigate();



    }

    }