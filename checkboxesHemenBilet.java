package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxesHemenBilet {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hemenbilet.com/");
        driver.findElement(By.cssSelector("#ucak-sorgulama > div > div.bilet-arama > div.turuncu-radio.left.bilet-ara > label:nth-child(4) > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("nereden")).sendKeys("SAM");
        Thread.sleep(2000);
        driver.findElement(By.id("nereden")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("nereye")).sendKeys("bad");
        Thread.sleep(2000);
        driver.findElement(By.id("nereye")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        //Assertion concept
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='calendar']")).isSelected());

        //System.out.println(driver.findElement(By.cssSelector("input[id='calendar']")).isSelected());
        // checkbox is here

        driver.findElement(By.cssSelector("input[id='calendar']")).click();
        Thread.sleep(2000);

        for (int i=1; i<5; i++){
            driver.findElement(By.xpath("//*[@id=\"ucak-sorgulama\"]/div/div[7]/ul/li[1]/div/span/div/div[1]/span")).click();
        }
        Thread.sleep(5000);

        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"yetiskin\"]")).getText(), 2);

        // //*[@id="ucak-sorgulama"]/div/div[7]/ul/li[1]/div/span/div/div[1]/span


        //System.out.println(driver.findElement(By.xpath("//*[@id=\"yetiskin\"]")).getText());

        driver.close();

    }

}
