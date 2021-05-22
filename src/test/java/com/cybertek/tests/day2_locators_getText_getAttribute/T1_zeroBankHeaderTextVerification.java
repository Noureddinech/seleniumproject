package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_zeroBankHeaderTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";
        // 1- locate the web element
        // 2- get the text of it using getText() method

        driver.findElement(By.tagName("h3"));
        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED!");

        }
    }
}
