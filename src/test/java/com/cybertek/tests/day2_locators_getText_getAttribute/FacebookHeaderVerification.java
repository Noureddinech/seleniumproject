package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement element = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = element.getText();
        if(expectedHeader.equals(actualHeader)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }

    }
}
