package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // navigate to facebook.com
        driver.get("https://www.meetup.com/");

        driver.findElement(By.xpath("//*[@id='globalNav']/nav/div/div[3]/a/div/span")).click();

        // xpath
        // navigate to login-username menu by using find element - By.xpath class
        driver.findElement(By.cssSelector("#email")).sendKeys("axhgf@yahoo.com");

        // navigate to the password part in the login menu by using findelemnt byclassname and enter some data by using sendkeys feature
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("345hgj");

        // xpah
        // navigate to the login button and click it

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[5]/input")).click();

        // Link text
        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.id("logoScript")).click();

        driver.findElement(By.cssSelector("#mupMain > div.stripe.stripe--withBGImg.stripe--noScrim.exploreHome-hero.exploreHome-hero--video > div > section > div > div.flex-item.button--wrapper > a > span")).click();

        driver.findElement(By.xpath("//*[@id=\"register-trigger--withEmail\"]")).click();

        //driver.findElement(By.cssSelector("#register-field--name")).click();

        driver.findElement(By.cssSelector("#register-field--name")).sendKeys("");

        driver.findElement(By.cssSelector("#register-field--email")).sendKeys("");

        System.out.println(driver.findElement(By.cssSelector("#register-error--name")).getText());

        driver.close();
    }

}
