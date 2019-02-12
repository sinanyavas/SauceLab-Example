package com.sinanselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDrive {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/about");
        System.out.println(driver.getTitle());
        System.out.println("sinan is the king");
        driver.quit();
    }
}
