package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {
        //
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("opera");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
       WebElement inputUserName = driver.findElement(By.className("login-inp"));
       inputUserName.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement login = driver.findElement(By.className("login-btn"));
        login.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String ecpectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        if (ecpectedErrorMessage.equals(actualErrorMessage)) {
            System.out.println("Error Message Verification is PASSED!!!");
        }else {
            System.out.println("Error Message Verification is FAILED!!!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
