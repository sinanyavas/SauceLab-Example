package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yenisafak.com/spor/super-lig-gol-kralligi");

        WebElement table = driver.findElement(By.cssSelector("#article-list > ul:nth-child(1)"));
        int rowcount = table.findElements(By.cssSelector("li[class='flx fcc fbw list']")).size();
        //String y = table.findElement(By.cssSelector("#article-list > ul:nth-child(1) > li:nth-child(2) > ul > li:nth-child(1) > ul > li.flx.fcc.fc")).getText();

        System.out.println(table.findElement(By.cssSelector("#article-list > ul:nth-child(1) > li:nth-child(2) > ul > li:nth-child(100) > ul > li.flx.fcc.fc")).getTagName());


        driver.quit();


    }

}



