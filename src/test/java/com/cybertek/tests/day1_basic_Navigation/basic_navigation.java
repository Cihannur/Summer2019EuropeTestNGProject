package com.cybertek.tests.day1_basic_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {
    public static void main(String[] args) {
        //we have to set up web driver based on gonna use browser
        WebDriverManager.chromedriver().setup();

        //creating object for using selenium driver
        WebDriver driver = new ChromeDriver();

        //open browser
        driver.get("https://www.amazon.com");

        //get title
        System.out.println(driver.getTitle());

    }
}
