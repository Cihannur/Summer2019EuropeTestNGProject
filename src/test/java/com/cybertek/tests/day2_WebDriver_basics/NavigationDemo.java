package com.cybertek.tests.day2_WebDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class
        WebDriver driver = new ChromeDriver();

         driver.get("https://www.google.com");

         //there is another way of opening web site
        driver.navigate().to("https://www.facebook.com");

        //go back to previous webpage
        driver.navigate().back();

        //it is waiting 3 seconds before go to next page
        Thread.sleep(3000);

        //goes forward after goes back
        driver.navigate().forward();


    }



}
