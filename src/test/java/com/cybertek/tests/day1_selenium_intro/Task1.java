package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     /**   driver.get("https:www.yahoo.com");
        String expected = "Yahoo";
        System.out.println("expected = " + expected);
        System.out.println("printed = "+driver.getTitle());
        System.out.println("Is it the expected title?  "+expected.equals(driver.getTitle()));
       */
        driver.get("http:/practice.cybertekschool.com");
        String expectedUrl = "cybertekschool";
        String expectedTitle = "Practice";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("printed Url = " + driver.getCurrentUrl());
        System.out.println("Is URL contains "+expectedUrl +" ? = "+ driver.getCurrentUrl().contains(expectedUrl));
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("printed title = " + driver.getTitle());
        System.out.println("Is the title as expected ?  "+expectedTitle.equals(driver.getTitle()));


    }
}
