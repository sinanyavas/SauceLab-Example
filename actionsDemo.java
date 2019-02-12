package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']"));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));


        a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        a.moveToElement(move).contextClick().build().perform();





        driver.quit();


    }

}
