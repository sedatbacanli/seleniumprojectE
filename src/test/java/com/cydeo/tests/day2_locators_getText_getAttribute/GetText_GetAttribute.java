package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GetAttribute {
    public static void main(String[] args) {
        //
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));
        //  Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();
        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Header text verification PASSED!!!");
        }else {
            System.out.println("Header text verification FAILED!!");}

        //4- Locate “First name” input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name
        String expectedFirstName = "first name";
        String actualFirstName = firstNameInput.getAttribute("placeholder");
        if (expectedFirstName.equals(actualFirstName)){
            System.out.println("Place Holder Test verification PASSED");
        } else
        { System.out.println("Place Holder Test verification FAILED!!!" );}
        driver.close();
    }
}
