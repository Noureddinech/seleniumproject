package com.cybertek.tests.practice;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebdriverFactory;
import com.cybertek.utilities.findAndClick;
import com.cybertek.utilities.findAndSendKeys;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoBlaze {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");
    }
    @Test
    public void onlineShop(){
        findAndClick.findElementAndClick(driver,"(//a[@class='list-group-item'])[3]");
        findAndClick.findElementAndClick(driver,"(//a[@href='prod.html?idp_=8'])[2]");
        findAndClick.findElementAndClick(driver,"//a[@onclick='addToCart(8)']");
        BrowserUtils.sleep(2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//a[@class='navbar-brand']");
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//a[.='Phones']");
        findAndClick.findElementAndClick(driver,"(//a[@href='prod.html?idp_=1'])[2]");
        findAndClick.findElementAndClick(driver,"//a[@onclick='addToCart(1)']");
        BrowserUtils.sleep(2);
        alert.accept();
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//a[@class='navbar-brand']");
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//a[.='Monitors']");
        findAndClick.findElementAndClick(driver,"(//a[@href='prod.html?idp_=10'])[2]");
        findAndClick.findElementAndClick(driver,"//a[@onclick='addToCart(10)']");
        BrowserUtils.sleep(2);
        alert.accept();
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//a[@id='cartur']");
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//td[.='Apple monitor 24']//following-sibling::td[2]/a");
        BrowserUtils.sleep(2);
        findAndClick.findElementAndClick(driver,"//button[@class='btn btn-success']");
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String country = faker.country().name();
        String city = faker.address().city();
        String creditCard = faker.business().creditCardNumber();
        String month = "April";
        String year = "2024";
        findAndSendKeys.findElementAndSendKeys(driver,"//input[@id='name']",name);
        findAndSendKeys.findElementAndSendKeys(driver,"//input[@id='country']",country);
        findAndSendKeys.findElementAndSendKeys(driver,"//input[@id='city']",city);
        findAndSendKeys.findElementAndSendKeys(driver,"//input[@id='card']",creditCard);
        findAndSendKeys.findElementAndSendKeys(driver,"//input[@id='month']",month);
        findAndSendKeys.findElementAndSendKeys(driver,"//input[@id='year']",year);
        findAndClick.findElementAndClick(driver,"//button[@onclick='purchaseOrder()']");
        WebElement recit = driver.findElement(By.xpath("//p[@class='lead text-muted ']"));
        String recitText = recit.getText();
        String [] recitDetails = recitText.split("\n");
        String id = "";
        String amount = "";
        for(String each : recitDetails){
            if(each.startsWith("Id")){
                id+=each;
            }else if(each.startsWith("Amount")){
                amount+=each;
            }
        }
        String[] amountDetails = amount.split(" ");
        String expectedAmount = "1150";
        Assert.assertEquals(amountDetails[1],expectedAmount);
        BrowserUtils.sleep(3);
    }
    @AfterMethod
    public void tearDown (){
       driver.close();
    }



}
