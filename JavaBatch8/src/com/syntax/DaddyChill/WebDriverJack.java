package com.syntax.DaddyChill;

import java.util.ArrayList;

interface WebDriverJACK {
    void open();
    void close();
    String getTitle();
}
     interface TakesScreenshotJACK {
        void getScreenshot();
    }
     interface RemoteWebDriverJACK extends WebDriverJACK, TakesScreenshotJACK {
        void navigate();
    }
     class SafariDriverJACK implements RemoteWebDriverJACK {
        final static String TITLE = "Safari";
        @Override
        public void navigate() {
            System.out.println("Navigating on Safari");
        }
        @Override
        public void getScreenshot() {
            System.out.println("Screenshotting on Safari");
        }
        @Override
        public void open() {
            System.out.println("Opening on Safari");
        }
        @Override
        public void close() {
            System.out.println("Closing on Safari");
        }
        @Override
        public String getTitle() {
            return TITLE;
        }
    }
    class ChromeDriverJACK implements RemoteWebDriverJACK {
        final static String TITLE = "Chrome";
        @Override
        public void navigate() {
            System.out.println("Navigating on Chrome");
        }
        @Override
        public void getScreenshot() {
            System.out.println("Screenshotting on Chrome");
        }
        @Override
        public void open() {
            System.out.println("Opening on Chrome");
        }
        @Override
        public void close() {
            System.out.println("Closing on Chrome");
        }
        @Override
        public String getTitle() {
            return TITLE;
        }
    }
     class FirefoxDriverJACK implements RemoteWebDriverJACK {
        final static String TITLE = "Firefox";
        @Override
        public void navigate() {
            System.out.println("Navigating on Firefox");
        }
        @Override
        public void getScreenshot() {
            System.out.println("Screenshotting on Firefox");
        }
        @Override
        public void open() {
            System.out.println("Opening on Firefox");
        }
        @Override
        public void close() {
            System.out.println("Closing on Firefox");
        }
        @Override
        public String getTitle() {
            return TITLE;
        }
    }


    class MainDriver {
        public static void main(String[] args) {
            RemoteWebDriverJACK chrome = new ChromeDriverJACK();
            RemoteWebDriverJACK safari = new SafariDriverJACK();
            RemoteWebDriverJACK firefox = new FirefoxDriverJACK();
            ArrayList<RemoteWebDriverJACK> listOfDrivers = new ArrayList<RemoteWebDriverJACK>();
            listOfDrivers.add(chrome);
            listOfDrivers.add(safari);
            listOfDrivers.add(firefox);
            for (RemoteWebDriverJACK driver : listOfDrivers) {
                System.out.println(driver.getTitle());
                System.out.println();
                driver.close();
                driver.getTitle();
                driver.open();
                driver.navigate();
                driver.getScreenshot();
                System.out.println();
            }
        }
    }


