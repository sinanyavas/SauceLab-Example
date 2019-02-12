package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.TableHeaderUI;
import java.awt.image.Kernel;
import java.util.concurrent.TimeUnit;

public class implicitwAitTatilSepeti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tatilsepeti.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("bolge")).click();
        driver.findElement(By.id("bolge")).sendKeys("Kaş, Antalya");
        driver.findElement(By.id("bolge")).sendKeys(Keys.ENTER);
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"search-panel\"]/div[3]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();

        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[1]/a")).click();
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[1]/a")).click();

        driver.findElement(By.className("ts-plus")).click();
        driver.findElement(By.className("ts-plus")).click();

        driver.findElement(By.xpath("//*[@id=\"search-panel\"]/div[5]/div/label")).click();

        driver.findElement(By.cssSelector("#searchBtn")).click();

        // Explicit Wait

        /*WebDriverWait d = new WebDriverWait(driver, 20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"HotelList\"]/article[1]/div/div[1]/a[1]")));*/

        driver.findElement(By.xpath("//*[@id=\"HotelList\"]/article[1]/div/div[1]/a[1]")).click();


        driver.close();

    }

}
