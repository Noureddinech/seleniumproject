package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle= "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }
        driver.findElement(By.id("email")).
                sendKeys("Nour@gmail.com");
        driver.findElement(By.id("pass")).
                sendKeys("abcdefrg"+Keys.ENTER);
        driver.navigate().refresh();
        String actualTitle2 = driver.getTitle(); ;
        String expectedTitle2 = "Log into Facebook";
        System.out.println("actual title :"+actualTitle2);
        System.out.println("expected title :"+expectedTitle2);
        if(expectedTitle2.equalsIgnoreCase(actualTitle2)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }


    }
}
