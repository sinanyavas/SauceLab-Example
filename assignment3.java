package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.manage().window().maximize();

        driver.findElement(By.id("autocomplete")).sendKeys("United");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text = (String) js.executeScript(script);

        while (!text.equalsIgnoreCase("United Kingdom")){

            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
            Thread.sleep(1000);
        }
        driver.quit();
    }
}
