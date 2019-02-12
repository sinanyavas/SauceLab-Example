package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownsFlyPgs {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flypgs.com/");
        driver.findElement(By.cssSelector("#fligth-searh > div:nth-child(3) > div:nth-child(3) > div > div.nxm2_form-control")).click();

        //int i=1;
        /*while (i<4) {
            driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[3]/div[3]/div/div[2]/ul/li[1]/div/a[2]/i")).click();
            Thread.sleep(2000L);
            i++;*/

        for(int i=1; i<5; i++){

        driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[3]/div[3]/div/div[2]/ul/li[1]/div/a[2]/i")).click();
        Thread.sleep(2000L);

    }
        System.out.println(driver.findElement(By.cssSelector("#fligth-searh > div:nth-child(3) > div:nth-child(3) > div > div.nxm2_form-control")).getText());
        driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[3]/div[3]/div/div[2]/a")).submit();
        driver.close();
    }
}
