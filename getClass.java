package com.sinanselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getClass {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

    //  navigate to a web site
        driver.get("https://www.google.com/intl/en-GB/about");

    //  validate that you have landed at correct url
        System.out.println(driver.getCurrentUrl());

    //  print out page source
        System.out.println(driver.getPageSource());

        System.out.println("sinan is the king");

    //  quit browser
        driver.quit();

    }


}
