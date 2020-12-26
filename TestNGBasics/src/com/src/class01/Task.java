package com.src.class01;

import org.testng.annotations.*;

public class Task {
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class annotation");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class annotation");
    }
    @Test

    public void testMethod(){
        System.out.println("I am test method");
    }

    @Test
    public void testMethod2(){
        System.out.println("I am second test");
    }
    @Test
    public void testMethod3(){
        System.out.println("I am third test");
    }
    @BeforeMethod
    public void beforeMethod(){//precondition and postconditions will not be considered @Test
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
}
