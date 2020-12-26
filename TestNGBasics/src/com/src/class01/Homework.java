package com.src.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework {
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate(){
        System.setProperty("webdriver.chrome.driver", "/Users/martaostash/eclipse-workspace/TestNG/Drivers/chromedriver-2");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test(priority = 0)
    public  void logoDisplayed() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        if (logo.isDisplayed()) {
            System.out.println("Logo is Displayed.Test Passed");
        } else {
            System.out.println("logo is not displayed. Test failed");
        }
    }
    @Test(enabled = false)
    public void invalidCredentials() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456789");
        driver.findElement(By.id("btnLogin")).click();
        WebElement invalidCredentialMessage=driver.findElement(By.id("spanMessage"));
        invalidCredentialMessage.isDisplayed();
        if(invalidCredentialMessage.isDisplayed()) {
            System.out.println("Invalid Credential Message is  displayed.Test Passed");
        }else{
            System.out.println("Invalid Credential Message is not displayed.Test Failed");
        }
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
