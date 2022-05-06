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
        //2. Go to https://www.yahoo.com
        //3. Verify title:
        //Expected: Yahoo
    }
}
