package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_EtsySearch {
    public static void main(String[] args) {
        // TC #6: Practice Cybertek – Class locator practice
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/inputs
        //3. Click “Home” button
        //4. Verify title as expected:
        //Expected: Practice
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/inputs");
        driver.findElement(By.className("nav-link")).click();
        if (driver.getTitle().equalsIgnoreCase("practice")){
            System.out.println("Practice title verification PASSED!");
        }else{
            System.out.println("Practice title verification FAILED!!!");

        }

    }
}
