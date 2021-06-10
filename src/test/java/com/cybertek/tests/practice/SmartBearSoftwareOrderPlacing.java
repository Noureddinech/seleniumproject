package com.cybertek.tests.practice;

import com.cybertek.utilities.SmartBearLogin;
import com.cybertek.utilities.WebdriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearSoftwareOrderPlacing {
    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test
    public void orderPlacing(){
        SmartBearLogin.linkVerification(driver);
        WebElement orderButton = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderButton.click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        select.selectByIndex(1);
        WebElement quantityBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantityBox.sendKeys("2");
        WebElement calculate = driver.findElement(By.xpath("//input[@type='submit']"));
        calculate.click();
        Faker faker = new Faker();
        String customerName = faker.name().fullName();
        String street = faker.address().streetName();
        String city = faker.address().city();
        String state = faker.address().state();
        String zipcode = faker.address().zipCode();
        String visaCard = faker.business().creditCardNumber();
        WebElement customerAddressBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customerAddressBox.sendKeys(customerName);
        WebElement streetBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        streetBox.sendKeys(street);
        WebElement cityBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        cityBox.sendKeys(street);
        WebElement stateBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        stateBox.sendKeys(state);
        WebElement zipcodeBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipcodeBox.sendKeys(zipcode.substring(0,5));
        WebElement visaRadioBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
        visaRadioBox.click();
        visaCard = visaCard.replace("-","");
        WebElement cardNumberBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
        cardNumberBox.sendKeys(visaCard);
        WebElement expirationBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        expirationBox.sendKeys("12/20");
        WebElement processBox = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processBox.click();
        String expectedText = "New order has been successfully added.";
        String actualText = driver.findElement(By.xpath("//div//strong")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
