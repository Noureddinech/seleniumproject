package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TS_WebOrderLogin {
    public static void main(String[] args) {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.get("https:/www.amazon.com");
        driver.manage().window().maximize();
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("wooden spoon"+ Keys.ENTER);
        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
        driver.close();


    }
}
