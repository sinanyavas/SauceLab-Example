package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class notArobotHandlingFrames {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sinemia.com/uyelik/giris");
        driver.manage().window().maximize();

        List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
        System.out.println(frameList.size());


        int frameCount = driver.findElements(By.tagName("iframe")).size();

        for (int i = 0; i < frameCount; i++) {

            driver.switchTo().frame(i);

            int count = driver.findElements(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark")).size();

            if (count > 0) {
                driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark")).click();
                break;

            } else {
                System.out.println("continue looping");
            }
        }

        Thread.sleep(5000);

        driver.quit();

    }

}
