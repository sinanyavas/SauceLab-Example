package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class handlingCalendarsHemenBilet {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hemenbilet.com/");
        driver.findElement(By.cssSelector("#ucak-sorgulama > div > div.bilet-arama > div.turuncu-radio.left.bilet-ara > label:nth-child(2) > span")).click();


        Assert.assertTrue(driver.findElement(By.cssSelector("#donusTarih")).isEnabled());

        driver.findElement(By.id("nereden")).sendKeys("Tümü: Istanbul, TR");
        Thread.sleep(500);
        driver.findElement(By.id("nereye")).sendKeys("Esenboga: Ankara, TR");

        driver.findElement(By.cssSelector("#gidisTarih")).click();

        while (!driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div > span.ui-datepicker-month")).getText().contains("Şubat")){

            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
        }

        List<WebElement> monthList = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
        int pass = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).size();

        for (int n = 0; n < pass; n++)
        {
            String hele = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(n).getText();
            if (hele.equalsIgnoreCase("11"))
            {
                driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(n).click();
                break;
            }
        }




        while (!driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last")).getText().contains("Mart"))
            {
                driver.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();
            }

        List<WebElement> monthList2 = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
        int pass2 = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).size();

        for (int m = 0; m < pass; m++) {
            String hele2 = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(m).getText();
            if (hele2.equalsIgnoreCase("23")) {
                driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(m).click();
                break;
            }
        }


        driver.findElement(By.id("calendar")).click();
        //Assertion concept
        //Assert.assertFalse(driver.findElement(By.cssSelector("input[id='calendar']")).isSelected());

        //System.out.println(driver.findElement(By.cssSelector("input[id='calendar']")).isSelected());
        // checkbox is here

//        driver.findElement(By.cssSelector("input[id='calendar']")).click();
//        Thread.sleep(5000);
//
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[4]/a")).click();
//
        for (int i=1; i<5; i++)
            {
            driver.findElement(By.xpath("//*[@id=\"ucak-sorgulama\"]/div/div[7]/ul/li[1]/div/span/div/div[1]/span")).click();
            }
//        Thread.sleep(5000);
//
//
//
        driver.findElement(By.className("btnBilet")).click();
//




        Thread.sleep(5000);
        driver.close();
    }

}
