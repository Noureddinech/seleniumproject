package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //TC # : Window Handle practice
        //1. Create a new class called: WindowHandlePractice
        //2. Create new test and make set ups
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //3. Go to : http://practice.cybertekschool.com/windows
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void window_test(){
        //4. Assert: Title is “Practice”
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";
        Assert.assertEquals(actualTitleBeforeClick,expectedTitleBeforeClick);
        String mainHandle = driver.getWindowHandle(); // this line to store the handle that we gonna use in the future
        //5. Click to: “Click Here” text
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        //6. Switch to new Window.
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("CURRENT TITLE WHILE SWITCHING: " + driver.getTitle());
        }


        String actualTitleAfterClick = driver.getTitle();


    }
    //7. Assert: Title is “New Window”
}