package com.cybertek.tests.practice;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearSoftwareLinkVerification {
    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test
    public void linkVerification(){
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        usernameBox.sendKeys("Tester");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        BrowserUtils.sleep(2);
        List<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//body//a")));
        System.out.println("links.size() = " + links.size());
        for(WebElement each : links){
            System.out.println(each.getText());
        }

    }
}
