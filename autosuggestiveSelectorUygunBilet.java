package com.sinanselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestiveSelectorUygunBilet {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.enuygun.com/ucak-bileti/");
        driver.manage().window().maximize();
        driver.findElement(By.id("from-input")).sendKeys("LUX");
        Thread.sleep(500);

        // TEsters handle hidden text through HTML JavaScript DOM.
        // how to do it than?
        // investigate properties of object and see if it has any hidden text attached to it. Yes there is!!
        // Javascript DOM use is needed than, but how can you use Javascript in Java?
        // In order to be able to shift the coding language, Java guys came up with a JavaScript API called JavaScript Executer;

        // JavaScript Executer
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.getElementById(\"from-input\").value;";
        String text = (String) js.executeScript(script);
        int i = 0;

        while (!text.equalsIgnoreCase("Chalons Vatry Havalimanı")) {
            i++;
            driver.findElement(By.id("from-input")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
            if (i > 10) {
                break;
            }
        }
        //Selenium can not grab hidden texts!!!
        // System.out.println(driver.findElement(By.id("from-input")).getText()); //Nothing printed

        //"Paris - Chalons Vatry Havalimanı (Luxeuil-les-bains, Fransa)"

        // driver.findElement(By.id("to-input")).sendKeys("IST");

        driver.close();

    }

}
