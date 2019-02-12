package com.sinanselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLCertificates {

    public static void main(String[] args) throws InterruptedException {

        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);


        ChromeOptions c=new ChromeOptions();
        c.merge(ch);

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");

    }
}
