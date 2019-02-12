package com.sinanselenium;

import org.openqa.selenium.WebDriver;


public class FirefoxDriver {

        public static void main(String[] args) {

            System.setProperty("webdriver.gecko.driver", "/Users/sinanyavas/Documents/selenium_downloads/geckodriver");

            WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
            driver.get("https://www.google.com/intl/en-GB/about");
            System.out.println(driver.getTitle());
            System.out.println("sinan is the king");

            driver.quit();

        }
    }

