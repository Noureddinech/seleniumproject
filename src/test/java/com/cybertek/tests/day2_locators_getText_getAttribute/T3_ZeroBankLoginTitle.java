package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_ZeroBankLoginTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).
                sendKeys("username");
        Thread.sleep(2000);
        driver.findElement(By.id("user_password")).
                sendKeys("password" + Keys.ENTER);

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }

    }
}
