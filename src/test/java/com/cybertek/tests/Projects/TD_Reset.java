package com.cybertek.tests.Projects;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TD_Reset {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");


    }
    @Test
    public void TD_Reset() throws InterruptedException {
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameBox.sendKeys("User174");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        // Hover over Fleet
        Actions action = new Actions(driver);
        WebElement fleet = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));
        action.moveToElement(fleet).perform();

        // click on vehicles option
       WebElement vehiclesOption = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"));
       vehiclesOption.click();

       //click on grid setting
       WebElement gridSetting = driver.findElement(By.xpath("//i[@class='fa-cog hide-text']"));
       gridSetting.click();

       // check Id
        WebElement idCheck = driver.findElement(By.xpath("//input[@id='column-c111']"));
        Assert.assertFalse(idCheck.isSelected());

        // Is is selected now
        idCheck.click();

        Assert.assertTrue(idCheck.isSelected());

        // close grid setting window
        driver.findElement(By.xpath("//span[@class='close']")).click();

        // reset setting
        WebElement resetButton = driver.findElement(By.xpath("//a[@title='Reset']"));
        resetButton.click();

         //  check if Id checked
        gridSetting.click();
        Assert.assertFalse(idCheck.isSelected());
    }

    @Test
    public void Add_Event() throws InterruptedException {
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameBox.sendKeys("User174");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        // Hover over Fleet
        Actions action = new Actions(driver);
        WebElement fleet = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));
        action.moveToElement(fleet).perform();

        // click on vehicles option
        WebElement vehiclesOption = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"));
        vehiclesOption.click();
        // click on cars
        Thread.sleep(2000);

        WebElement cybertek123 = driver.findElement(By.xpath("(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate'])[1]"));
        cybertek123.click();
        // add events

        WebElement addEvents = driver.findElement(By.xpath("//a[@data-id='94']"));
        addEvents.click();
        // add title

        WebElement titleBox = driver.findElement(By.xpath("//input[@id='oro_calendar_event_form_title-uid-60b7044811593']"));
        titleBox.sendKeys("BugKillers were here!!!");
    }
    @AfterClass
    public void teardownClass(){
       driver.close();
    }

}
