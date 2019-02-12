package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCustomisedXpathCssFacebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hangks@ghy.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kshhasjf746");
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        driver.close();
    }
}
