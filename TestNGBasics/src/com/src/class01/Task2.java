package com.src.class01;

import org.testng.annotations.*;

public class Task2 {
    /*
    Create class that will have:
Before and After Class annotation
Before and After Method annotation
2 methods with Test annotation
     */
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class method");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class method");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @Test
    public void test1(){
        System.out.println("test 1");
    }
    @Test
    public void test2(){
        System.out.println("test 2");
    }




}
