package com.cybertek.tests.day2_WebDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningTwoBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //to open new browser
        driver.get("https://practice.cybertekschool.com");
        Thread.sleep(5000);
        driver.close();

        driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com/open_new_tab");
        driver.quit();

    }
}
