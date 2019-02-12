package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsRediffCSSSelector {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.rediff.com/");
            driver.findElement(By.cssSelector("#signin_info > a:nth-child(1)")).click();
            driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("mrking");
            driver.findElement(By.cssSelector("input[id='password']")).sendKeys("helloworld");
            driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();
            System.out.println("mission completed");
            driver.close();
    }

}
