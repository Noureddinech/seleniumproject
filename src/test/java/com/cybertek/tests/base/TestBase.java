package com.cybertek.tests.base;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

   public  WebDriver driver;

    @BeforeMethod
    public void setUpClass(){
        driver = WebdriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
