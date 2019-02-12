package com.sinanselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getClassDay2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

    //  clicking back button on address bar

        // navigate to below site
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println("i landed at facebook");

        // then navigate another site
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println("i landed at google");

        // click back button at address bar
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        System.out.println("I am back at facebook");

        // click forward button at address bar
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        System.out.println("I am back at google");

        System.out.println("task completed");

        driver.close();
    }

}
