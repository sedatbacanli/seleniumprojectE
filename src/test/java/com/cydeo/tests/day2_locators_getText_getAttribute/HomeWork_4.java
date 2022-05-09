package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs ");
        //3- Click to “Home” link

        //4- Verify title is as expected:
        //Expected: Practice
        //
        //PS: Locate “Home” link using “className” locator
        //
    }
}
