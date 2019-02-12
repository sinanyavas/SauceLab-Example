package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonsHemenBilet {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hemenbilet.com/");

        //driver.findElement(By.cssSelector("#ucak-sorgulama > div > div.bilet-arama > div.turuncu-radio.left.bilet-ara > label:nth-child(4) > span")).click();

        //System.out.println(driver.findElement(By.xpath("//form[@name='ucak-sorgulama']/div/div/div[2]")).getSize());

        driver.findElement(By.xpath("//div[@class='turuncu-radio left bilet-ara']/label[2]/span")).click();
        driver.findElement(By.id("nereden")).sendKeys("SAM");
        Thread.sleep(2000);
        driver.findElement(By.id("nereden")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("nereye")).sendKeys("bad");
        Thread.sleep(2000);
        driver.findElement(By.id("nereye")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();


    }


}
