package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
       WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

    //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if (expectedRememberMeLabel.equals(actualRememberMeLabel)){
            System.out.println("Label Verification is PASSED!!");
        }else{
            System.out.println("Label Verification is FAILED!!!");
        }
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordlinkText = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordlinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordlinkText.getText();
        if (expectedForgotPasswordlinkText.equals(actualForgotPasswordLinkText)) {
            System.out.println("Forgot Password Link Text Verification is PASSED!!!");
        }else {
            System.out.println("Forgot Password Link Text Verification is FAILED!!!");
        }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        //
        //
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
