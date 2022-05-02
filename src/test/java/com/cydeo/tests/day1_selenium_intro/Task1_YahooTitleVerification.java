package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //2. Go to https://www.yahoo.com
        WebDriver driver = new ChromeDriver();

        //3. Verify title:
        //Expected: Yahoo
    }
}
