package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSalesforce {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=uk");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ndhksk");
        driver.findElement(By.cssSelector("#password")).sendKeys("ahgfkafjga123");
        driver.findElement(By.cssSelector("#Login")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
        driver.close();
    }

    public static class IamNOTaROBOTframeHANDLING {
    }
}
