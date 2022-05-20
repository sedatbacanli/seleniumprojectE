package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setUpMethod(){
        System.out.println("---> BeforeClassMethod is running!");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("---> AfterClassMethod is running!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");

    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
    }
}
