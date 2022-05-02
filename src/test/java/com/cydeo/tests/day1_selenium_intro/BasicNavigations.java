package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://google.com");

        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle()=" + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);
        driver.manage().window().maximize();

        driver.close();




    }
}
