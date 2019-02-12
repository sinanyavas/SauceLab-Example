package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndAutomationUsingUIElementsWithSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hemenbilet.com/");

        //driver.findElement(By.xpath("//*[@id=\"ucak-sorgulama\"]/div/div[1]/div[2]/label[2]/span")).click();

        driver.findElement(By.cssSelector("#ucak-sorgulama > div > div.bilet-arama > div.turuncu-radio.left.bilet-ara > label:nth-child(2) > span")).click();
        Thread.sleep(2000);

       // Assert.assertTrue(driver.findElement(By.cssSelector("#donusTarih")).isEnabled());

        driver.findElement(By.id("nereden")).sendKeys("Tümü: Istanbul, TR");
        Thread.sleep(2000);
        driver.findElement(By.id("nereden")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.id("nereye")).sendKeys("Esenboga: Ankara, TR");
        Thread.sleep(2000);
        driver.findElement(By.id("nereye")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#gidisTarih")).click();
        driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(2) > td:nth-child(2) > a")).click();

        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[4]/a")).click();

        for (int i=1; i<3; i++){
            driver.findElement(By.xpath("//*[@id=\"ucak-sorgulama\"]/div/div[7]/ul/li[1]/div/span/div/div[1]/span")).click();
        }
        Thread.sleep(5000);

        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"yetiskin\"]")).getText(), 2);

        // //*[@id="ucak-sorgulama"]/div/div[7]/ul/li[1]/div/span/div/div[1]/span


        //System.out.println(driver.findElement(By.xpath("//*[@id=\"yetiskin\"]")).getText());




        driver.findElement(By.className("btnBilet")).click();


        Thread.sleep(5000);


        driver.close();


    }


}
