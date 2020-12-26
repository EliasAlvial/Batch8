package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
    Homework
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser


navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser

     */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Josue");
        driver.findElement(By.id("customer.lastName")).sendKeys("D'elia'");
        driver.findElement(By.name("customer.address.street")).sendKeys("2008 chestoak dr");
        driver.findElement(By.name("customer.address.city")).sendKeys("Chicago");
        driver.findElement(By.name("customer.address.state")).sendKeys("Illinois");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("60610");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("3018486627");
        driver.findElement(By.name("customer.ssn")).sendKeys("2526469492");






    }
}
