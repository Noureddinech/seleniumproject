package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearLogin {
    public static void linkVerification(WebDriver driver){
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        usernameBox.sendKeys("Tester");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }
}
