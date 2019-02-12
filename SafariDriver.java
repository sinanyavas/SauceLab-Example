package com.sinanselenium;

import org.openqa.selenium.WebDriver;

public class SafariDriver {

    public static void main(String[] args) {

        WebDriver driver = new org.openqa.selenium.safari.SafariDriver();
        driver.get("https://www.google.com/intl/en-GB/about");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("sinan is the king");
        driver.quit();


    }

}
