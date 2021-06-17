package com.cybertek.tests.day10_web_table_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TableTask3 {
    WebDriver driver;
    //1.    Open browser and go to: http://practice.cybertekschool.com/tables#edit
    //2.    Locate first table and verify Tim has due amount of “$50”
    //
    //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
    @BeforeMethod
    public void setUpClass(){
        driver = WebdriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables#edit");

    }
    @Test
    public void task3_return_tims_due_amount(){
        String dueDate = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]")).getText();
        String expectedAmount = "$50.00";
        Assert.assertEquals(dueDate,expectedAmount);

    }
    @Test
    public void verify_method(){
        TableUtils.verifyOrder(driver,"Jason");
    }


}
