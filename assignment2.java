package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class assignment2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
        String  n = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
        System.out.println(n);

        Select s=new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]")));
        s.selectByVisibleText(n);

        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(n);
        driver.findElement(By.id("alertbtn")).click();

        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(3000);

        driver.close();
    }
}
