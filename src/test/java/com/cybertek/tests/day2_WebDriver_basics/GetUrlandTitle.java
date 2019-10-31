package com.cybertek.tests.day2_WebDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetUrlandTitle {

    //main enter or psvm
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //this 3 things need to be done to open a browser
        driver.get("https://practice.cybertekschool.com");

        String title = driver.getTitle();

        //soutv--> you don need to write "title"
        System.out.println("title = " + title);

        String currntUrl= driver.getCurrentUrl();
        System.out.println("currntUrl = " + currntUrl);

        //get the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
