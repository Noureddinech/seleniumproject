package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4NavigationAndAttributeValueVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.google.com");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("Apple" + Keys.ENTER);
        boolean title = driver.getTitle().startsWith("Apple");
        System.out.println("title = " + title);
        

    }
}
