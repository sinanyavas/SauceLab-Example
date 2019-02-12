package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropdownsLongevityTR {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://longevity.istbooking.com/tr-TR/");
        Select s = new Select(driver.findElement(By.cssSelector("#odaSayisi")));
        s.selectByIndex(3);
        s.selectByVisibleText("4");
        System.out.println("numb of guests is 4");

        // select class allow us to handle static dropdowns easily

        driver.close();

    }

}
