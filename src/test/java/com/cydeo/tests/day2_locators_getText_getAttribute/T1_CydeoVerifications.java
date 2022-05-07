package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://.practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL Contains
        //Expected: cydeo
        String ecpectedURL ="cydeo";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(ecpectedURL)){
            System.out.println("URL Verification PASSED");
        }else {
            System.out.println("URL Verification FAILED");
        }
        //4. Verify Title
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTtle = driver.getTitle();
        if (actualTtle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!");
        }
    }
}
